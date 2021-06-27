package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Photo;
import kodlamaio.hrms.entities.dtos.PhotoSaveDto;

public interface PhotoService {
	
	//Result add(Photo photo);
	
	Result add(PhotoSaveDto photoSaveDto);

	DataResult<List<Photo>> getByJobSeekerId(int jobSeekerId);
	
	DataResult<List<Photo>> getByResumeId(int resumeId);
}
