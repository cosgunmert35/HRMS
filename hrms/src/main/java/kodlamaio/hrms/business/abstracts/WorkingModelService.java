package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkingModel;

public interface WorkingModelService {
	
	Result add(WorkingModel workingModel);
	
	DataResult<List<WorkingModel>> getAll();
	
	DataResult<WorkingModel> getByWoringModelId(int id);

}
