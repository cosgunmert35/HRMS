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
	
	private SummaryDao dao;

	@Autowired
	public SummaryManager(SummaryDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Result add(Summary summary) {
		this.dao.save(summary);
		return new SuccessResult("Açıklama başarıyla eklendi.");
	}
	
	@Override
	public Result deleteById(int id) {
		this.dao.deleteById(id);
		return new SuccessResult("Başarıyla silindi.");
	}

	@Override
	public DataResult<List<Summary>> getAll() {
		return new SuccessDataResult<List<Summary>>(this.dao.findAll());
	}

	
	
	
}
