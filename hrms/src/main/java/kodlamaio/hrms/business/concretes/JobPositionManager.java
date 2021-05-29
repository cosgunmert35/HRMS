package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	
	private JobPositionDao positionDao;
	
	
	
	

	public JobPositionManager(JobPositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}





	@Override
	public List<JobPosition> getAll() {
		return this.positionDao.findAll();
	}

}
