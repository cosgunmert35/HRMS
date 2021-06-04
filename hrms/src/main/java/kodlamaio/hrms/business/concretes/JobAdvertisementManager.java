package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	private JobAdvertisementDao advertisementDao;
	
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao advertisementDao) {
		super();
		this.advertisementDao = advertisementDao;
	}

	@Override
	public Result add(JobAdvertisement advertisement) {
		this.advertisementDao.save(advertisement);
		return new SuccessResult("İş ilanı başarıyla eklendi.");
	}
	

	@Override
	public Result updateIsActiveStatus(int id, boolean isActive) {
		this.advertisementDao.updateIsActiveStatus(id, isActive);
		return new SuccessResult("İş ilanı aktiflik durumu güncellendi.");
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.advertisementDao.findAll(),
				"İş ilanları getirildi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActive(boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.advertisementDao.findByIsActive(isActive),
				"Aktif iş ilanları getirildi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveCreateDateOrderByDESC() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.advertisementDao.findByIsActiveCreateDateOrderByDESC(),
				"Tarihe göre sıralanmış aktif iş ilanları.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(
				this.advertisementDao.findByIsActiveAndEmployer_CompanyName(isActive, companyName), 
				"İşverene ait aktif ilanlar getirildi.");
	}

	




	



	


}
