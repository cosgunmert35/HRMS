package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SummaryService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SummaryDao;
import kodlamaio.hrms.entities.concretes.Summary;

@Service
public class SummaryManager implements SummaryService {
	
	private SummaryDao summaryDao;
	
	@Autowired
	public SummaryManager(SummaryDao summaryDao) {
		super();
		this.summaryDao = summaryDao;
	}

	@Override
	public Result add(Summary summary) {
		this.summaryDao.save(summary);
		return new SuccessResult("Kısa özet başarıyla eklendi.");
	}

	@Override
	public DataResult<List<Summary>> getByResumeId(int resumeId) {
		return new SuccessDataResult<List<Summary>>(this.summaryDao.getByResumeId(resumeId));
	}
	
	
	
}
