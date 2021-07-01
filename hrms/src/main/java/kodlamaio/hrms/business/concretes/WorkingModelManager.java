package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.WorkingModelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkingModelDao;
import kodlamaio.hrms.entities.concretes.WorkingModel;

@Service
public class WorkingModelManager implements WorkingModelService {
	
	private WorkingModelDao modelDao;
	
	@Autowired
	public WorkingModelManager(WorkingModelDao modelDao) {
		super();
		this.modelDao = modelDao;
	}

	@Override
	public Result add(WorkingModel workingModel) {
		this.modelDao.save(workingModel);
		return new SuccessResult("Çalışma modeli eklendi.");
	}

	@Override
	public DataResult<List<WorkingModel>> getAll() {
		return new SuccessDataResult<List<WorkingModel>>(this.modelDao.findAll(), "Çalışma modelleri getirildi.");
	}

	@Override
	public DataResult<WorkingModel> getByWoringModelId(int id) {
		return new SuccessDataResult<WorkingModel>(this.modelDao.getByWoringModelId(id), "Çalışma modeli getirildi.");
	}
	
	

}
