package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.AccountType;

public interface AccountTypeService {

	Result add(AccountType accountType);

	DataResult<List<AccountType>> getAll();

}
