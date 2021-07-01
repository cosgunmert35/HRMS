package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementVerificationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementVerificationDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisementVerification;

@Service
public class JobAdvertisementVerificationManager implements JobAdvertisementVerificationService {
	
	private JobAdvertisementVerificationDao verificationDao;
	
	@Autowired
	public JobAdvertisementVerificationManager(JobAdvertisementVerificationDao verificationDao) {
		super();
		this.verificationDao = verificationDao;
	}

	@Override
	public Result add(JobAdvertisementVerification advertisementVerification) {
		this.verificationDao.save(advertisementVerification);
		return new SuccessResult("Başarıyla doğrulandı.");
	}

	@Override
	public DataResult<List<JobAdvertisementVerification>> getAll() {
		return new SuccessDataResult<List<JobAdvertisementVerification>>(this.verificationDao.findAll());
	}

	@Override
	public DataResult<JobAdvertisementVerification> getByJobAdvertisementVerificationId(int id) {
		
		return new SuccessDataResult<JobAdvertisementVerification>(this.verificationDao.getByJobAdvertisementVerificationId(id));
	}

}
