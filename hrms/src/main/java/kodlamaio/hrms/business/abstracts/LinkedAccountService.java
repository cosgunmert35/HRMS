package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.LinkedAccount;

public interface LinkedAccountService {
	
	Result add(LinkedAccount linkedAccount);
	
	DataResult<List<LinkedAccount>> getAll();
	
	DataResult<List<LinkedAccount>> getByResumeId(int resumeId);

}
