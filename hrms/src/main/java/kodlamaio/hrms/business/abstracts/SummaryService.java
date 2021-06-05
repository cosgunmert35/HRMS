package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Summary;

public interface SummaryService {
	
	Result add(Summary summary);
	
	Result deleteById(int id);
	DataResult<List<Summary>> getAll();

}
