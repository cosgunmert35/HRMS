package kodlamaio.hrms.adapter.concretes;

import kodlamaio.hrms.adapter.abstracts.UploadPhotoService;

import java.io.File;
import java.util.Map;

import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

public class UploadPhotoAdapter implements UploadPhotoService {

	
	private Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "YourName", "api_key",
	 		"YourApiKey", "api_secret", "YourApiSecret", "secure", true));
	@Override
	public String uploadPhoto(String photoPath) {
		try {
			File file = new File(photoPath);
			Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
			return uploadResult.get("url").toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
