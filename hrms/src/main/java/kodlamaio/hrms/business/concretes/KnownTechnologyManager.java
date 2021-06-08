package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.KnownTechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.KnownTechnologyDao;
import kodlamaio.hrms.entities.concretes.KnownTechnology;

@Service
public class KnownTechnologyManager implements KnownTechnologyService {

	private KnownTechnologyDao knownTechnologyDao;
	
	@Autowired
	public KnownTechnologyManager(KnownTechnologyDao knownTechnologyDao) {
		super();
		this.knownTechnologyDao = knownTechnologyDao;
	}

	@Override
	public Result add(KnownTechnology knownTechnology) {
		this.knownTechnologyDao.save(knownTechnology);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public DataResult<List<KnownTechnology>> findByJobSeeker(int jobSeekerId) {
		return new SuccessDataResult<List<KnownTechnology>>(this.knownTechnologyDao.findByJobSeeker(jobSeekerId));
	}
	
	
}
