package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisementVerification;

public interface JobAdvertisementVerificationService {
	
	Result add(JobAdvertisementVerification advertisementVerification);
	
	DataResult<List<JobAdvertisementVerification>> getAll();
	
	DataResult<JobAdvertisementVerification> getByJobAdvertisementVerificationId(int id);
}
