package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Photo;

@RestController
@RequestMapping(value = "/api/photos")
public class PhotosController {
	private PhotoService photoService;

	public PhotosController(PhotoService photoService) {
		super();
		this.photoService = photoService;
	}
	
	@PostMapping(value = "/add")
	Result add(@RequestBody Photo photo) {
		return this.photoService.add(photo);
	}

	@GetMapping(value = "/getByJobSeekerId")
	DataResult<List<Photo>> getByJobSeekerId(@RequestParam int jobSeekerId) {
		return this.photoService.getByJobSeekerId(jobSeekerId);
	}
	
	@GetMapping(value = "/getByResumeId")
	DataResult<List<Photo>> getByResumeId(@RequestParam int resumeId) {
		return this.photoService.getByResumeId(resumeId);
	}
}
