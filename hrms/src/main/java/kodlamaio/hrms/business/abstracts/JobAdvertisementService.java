package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	
	
	public DataResult<List<JobAdvertisement>> getAll();
	
	Result add(JobAdvertisement advertisement);
	
	Result updateIsActiveStatus(int id, boolean isActive);
	
	DataResult<List<JobAdvertisement>> findByIsActive(boolean isActive);
	
	DataResult<List<JobAdvertisement>> findByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName);
	
	DataResult<List<JobAdvertisement>> findByIsActiveCreateDateOrderByDESC();
	
	

}
