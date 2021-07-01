package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrms.entities.concretes.Resume;
import kodlamaio.hrms.entities.dtos.ResumeDto;

@Service
public class ResumeManager implements ResumeService {

	private ResumeDao resumeDao;
	private ModelMapper modelMapper = new ModelMapper();

	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}
	
	
	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("Öz geçmiş eklendi.");
	}
	
	
	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll());
	}


	@Override
	public DataResult<List<Resume>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.getByJobSeekerId(id));
	}

	
	  @Override public DataResult<List<ResumeDto>> getByResumeDto() { 
		  
		  List<Resume> resumes = this.resumeDao.findAll();
		  
		  List<ResumeDto> resumeDtos = resumes.stream().map(resume -> modelMapper.map(resume, ResumeDto.class)).collect(Collectors.toList());
		  
		  
		  return new SuccessDataResult<List<ResumeDto>>(resumeDtos);
	  }
	  
	 


}
