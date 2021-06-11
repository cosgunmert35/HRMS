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
	
	private KnownTechnologyDao technologyDao;
	
	@Autowired
	public KnownTechnologyManager(KnownTechnologyDao technologyDao) {
		super();
		this.technologyDao = technologyDao;
	}

	@Override
	public Result add(KnownTechnology knownTechnology) {
		this.technologyDao.save(knownTechnology);
		return new SuccessResult("Başarıyla eklendi.");
	}

	@Override
	public DataResult<List<KnownTechnology>> getAll() {
		return new SuccessDataResult<List<KnownTechnology>>(this.technologyDao.findAll());
	}

	@Override
	public DataResult<List<KnownTechnology>> getByResumeId(int resumeId) {
		return new SuccessDataResult<List<KnownTechnology>>(this.technologyDao.getByResumeId(resumeId));
	}
	
	

}
