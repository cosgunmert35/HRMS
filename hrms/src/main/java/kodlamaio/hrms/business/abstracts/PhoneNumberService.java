package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.PhoneNumber;

public interface PhoneNumberService {

	Result add(PhoneNumber phoneNumber);

	DataResult<List<PhoneNumber>> getAll();

}
