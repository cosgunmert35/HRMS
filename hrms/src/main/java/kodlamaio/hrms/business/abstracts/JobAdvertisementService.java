package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;
import kodlamaio.hrms.entities.dtos.JobAdvertisementSaveDto;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisementSaveDto advertisementSaveDto);
	
	DataResult<List<JobAdvertisementDetailDto>> getAll();
	
	DataResult<JobAdvertisementDetailDto> getByJobAdvertisement_Id(int id);
	
	DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive);
	
	DataResult<List<JobAdvertisement>> getBySortedDate();
	
	DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName);
	
	Result update(JobAdvertisementSaveDto advertisementSaveDto);
	
	//DataResult<List<JobAdvertisementDetailDto>> getAllWithDto();
}
