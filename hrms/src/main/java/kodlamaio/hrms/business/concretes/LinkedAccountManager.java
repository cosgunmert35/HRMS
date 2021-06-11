package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LinkedAccountService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LinkedAccountDao;
import kodlamaio.hrms.entities.concretes.LinkedAccount;

@Service
public class LinkedAccountManager implements LinkedAccountService {
	
	private LinkedAccountDao linkedAccountDao;

	public LinkedAccountManager(LinkedAccountDao linkedAccountDao) {
		super();
		this.linkedAccountDao = linkedAccountDao;
	}

	@Override
	public Result add(LinkedAccount linkedAccount) {
		this.linkedAccountDao.save(linkedAccount);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public DataResult<List<LinkedAccount>> getAll() {
		return new SuccessDataResult<List<LinkedAccount>>(this.linkedAccountDao.findAll(), "Bağlantısı eklenmiş tüm hesaplar");
	}

	@Override
	public DataResult<List<LinkedAccount>> getByResumeId(int resumeId) {
		return new SuccessDataResult<List<LinkedAccount>>(this.linkedAccountDao.getByResumeId(resumeId), resumeId + " id'li kullanıcıya ait banğlanmış hesaplar.");
	}
	
	
}
