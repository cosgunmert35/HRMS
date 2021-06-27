package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapter.abstracts.UploadPhotoService;
import kodlamaio.hrms.adapter.concretes.UploadPhotoAdapter;
import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PhotoDao;
import kodlamaio.hrms.entities.concretes.Photo;
import kodlamaio.hrms.entities.dtos.PhotoSaveDto;

@Service
public class PhotoManager implements PhotoService {
	
	private PhotoDao photoDao;
	
	private UploadPhotoService photoService;
	
	private ModelMapper mapper;
	
	@Autowired
	public PhotoManager(PhotoDao photoDao) {
		super();
		this.photoDao = photoDao;
	}
	



	@Override
	public Result add(PhotoSaveDto photoSaveDto) {
		mapper = new ModelMapper();
		Photo photo = mapper.map(photoSaveDto, Photo.class);
		photoService = new UploadPhotoAdapter();
		photo.setPhotoLink(this.photoService.uploadPhoto(photo.getPhotoLink()));
		this.photoDao.save(photo);
		return new SuccessResult(photo.getPhotoLink() + " Fotoğraf eklendi");
	}

	@Override
	public DataResult<List<Photo>> getByJobSeekerId(int jobSeekerId) {
		return new SuccessDataResult<List<Photo>>(this.photoDao.getByJobSeekerId(jobSeekerId), jobSeekerId + " id'li kullanıcının fotoğrafı getirildi.");
	}

	@Override
	public DataResult<List<Photo>> getByResumeId(int resumeId) {
		return new SuccessDataResult<List<Photo>>(this.photoDao.getByResumeId(resumeId), resumeId + " cv id'li kullanıcının fotoğrafı getirildi.");
	}




	
	
	
}
