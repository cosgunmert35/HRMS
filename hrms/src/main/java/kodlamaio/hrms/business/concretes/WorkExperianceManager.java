package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.WorkExperianceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkExperianceDao;
import kodlamaio.hrms.entities.concretes.WorkExperiance;

@Service
public class WorkExperianceManager implements WorkExperianceService {
	
	private WorkExperianceDao workExperianceDao;

	@Autowired
	public WorkExperianceManager(WorkExperianceDao workExperianceDao) {
		super();
		this.workExperianceDao = workExperianceDao;
	}

	@Override
	public Result add(WorkExperiance workExperiance) {
		this.workExperianceDao.save(workExperiance);
		return new SuccessResult("İş deneyimi başarıyla eklendi.");
	}

	@Override
	public DataResult<WorkExperiance> getByJobSeeker(int jobSeekerId) {
		return new SuccessDataResult<WorkExperiance>(this.workExperianceDao.getByJobSeeker(jobSeekerId)); 
	}
	
	@Override
	public Result delete(int id) {
		this.workExperianceDao.deleteById(id);
		return new SuccessResult("Başarıyla silindi.");
	}

	

}
