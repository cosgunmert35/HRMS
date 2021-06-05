package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.AccountTypeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.AccountTypeDao;
import kodlamaio.hrms.entities.concretes.AccountType;


@Service
public class AccountTypeManager implements AccountTypeService {
	
	private AccountTypeDao accountTypeDao;
	
	
	@Autowired
	public AccountTypeManager(AccountTypeDao accountTypeDao) {
		super();
		this.accountTypeDao = accountTypeDao;
	}

	@Override
	public Result add(AccountType accountType) {
		this.accountTypeDao.save(accountType);
		return new SuccessResult(accountType.getTypeName() + " Kullanıcı türü başarıyla eklendi.");
	}

	@Override
	public DataResult<List<AccountType>> getAll() {
		return new SuccessDataResult<List<AccountType>>(this.accountTypeDao.findAll(), "Kullanıcı türleri başarıyla getirildi.");
	}

}
