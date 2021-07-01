package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;
import kodlamaio.hrms.entities.dtos.JobAdvertisementSaveDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao advertisementDao;
	private ModelMapper modelMapper;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao advertisementDao) {
		super();
		this.advertisementDao = advertisementDao;
	}

	
	@Override
	public Result add(JobAdvertisementSaveDto advertisementSaveDto) {
		modelMapper = new ModelMapper();
		JobAdvertisement advertisement = modelMapper.map(advertisementSaveDto, JobAdvertisement.class);
		
		modelMapper.map(this.advertisementDao.save(advertisement), JobAdvertisementSaveDto.class);
		return new SuccessResult("Başarıyla Ekelendi.");
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisementDao.findAll());
	}

	@Override
	public DataResult<JobAdvertisement> getByJobAdvertisement_Id(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.advertisementDao.getByJobAdvertisement_Id(id));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisementDao.getByIsActive(isActive));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getBySortedDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisementDao.getByIsActiveAndSortedDate());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(boolean isActive,
			String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisementDao.getByIsActiveAndEmployer_CompanyName(isActive, companyName));
	}

	@Override
	public Result deactiveJobAdvertisement(int id, int employerId) {
//		JobAdvertisement jobAdds = this.advertisementDao.getByJobAdvertisement_Id(employerId);
//		jobAdds.setActive(false);
//		System.out.println(jobAdds);
		//this.advertisementDao.save(jobAdds);
		return new SuccessResult(id + "'li iş ilanı kapatıldı.");
	}


	@Override
	public DataResult<List<JobAdvertisementDetailDto>> getAllWithDto() {
		modelMapper = new ModelMapper();
		
		List<JobAdvertisement> advertisements = this.advertisementDao.findAll();
		List<JobAdvertisementDetailDto> jobAdvertisementDetailDtos = advertisements.stream()
				.map(advertisement -> modelMapper.map(advertisements, JobAdvertisementDetailDto.class))
				.collect(Collectors.toList());
		
		return new SuccessDataResult<List<JobAdvertisementDetailDto>>(jobAdvertisementDetailDtos);
	}


	
	


}
