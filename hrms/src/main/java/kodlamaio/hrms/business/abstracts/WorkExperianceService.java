package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkExperiance;

public interface WorkExperianceService {
	
	Result add(WorkExperiance workExperiance);
	
	DataResult<List<WorkExperiance>> getByJobSeeker(int jobSeekerId);
	
	// DataResult<List<WorkExperiance>> getAll();
	
	Result delete(int id);

}
