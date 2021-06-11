package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Summary;

public interface SummaryService {
	
	Result add(Summary summary);
	
	DataResult<List<Summary>> getByResumeId(int resumeId);

}
