package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;
import kodlamaio.hrms.entities.dtos.JobAdvertisementSaveDto;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisementSaveDto advertisementSaveDto);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<JobAdvertisement> getByJobAdvertisement_Id(int id);
	
	DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive);
	
	DataResult<List<JobAdvertisement>> getBySortedDate();
	
	DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName);
	
	Result deactiveJobAdvertisement(int id, int employerId);
	
	DataResult<List<JobAdvertisementDetailDto>> getAllWithDto();
}
