package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapter.abstracts.CheckService;
import kodlamaio.hrms.adapter.concretes.MernisServiceAdapter;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	
	private CheckService checkService;
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}
	

	public JobSeekerManager(CheckService checkService) {
		super();
		this.checkService = checkService;
	}


	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listesi getirildi.");
	}
	
	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getById(id), id + "'li kullanıcı getirildi.");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		/*checkService = new MernisServiceAdapter();
		if(!checkService.checkIsPerson(jobSeeker)) {
			// this.jobSeekerDao.save(jobSeeker);
			System.out.println("Gerçek kullanıcı değil!!!");
		}*/
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Kullanıcı başarıyla eklendi.");
	}

	@Override
	public DataResult<JobSeeker> getByEmail(String email) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getByEmail(email));
	}

	@Override
	public DataResult<JobSeeker> getByNationalityId(String nationalityId) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getByNationalityId(nationalityId));
	}


	

}
