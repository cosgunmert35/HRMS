package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PhoneNumberService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PhoneNumberDao;
import kodlamaio.hrms.entities.concretes.PhoneNumber;

@Service
public class PhoneNumberManager implements PhoneNumberService {

	private PhoneNumberDao phoneNumberDao;

	@Autowired
	public PhoneNumberManager(PhoneNumberDao phoneNumberDao) {
		super();
		this.phoneNumberDao = phoneNumberDao;
	}

	@Override
	public Result add(PhoneNumber phoneNumber) {
		this.phoneNumberDao.save(phoneNumber);
		return new SuccessResult(phoneNumber.getPhoneNumber() + " başarıyla eklendi.");
	}

	@Override
	public DataResult<List<PhoneNumber>> getAll() {
		return new SuccessDataResult<List<PhoneNumber>>(this.phoneNumberDao.findAll());
	}

}
