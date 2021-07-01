package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping(value = "/api/jobSeekers")
@CrossOrigin
public class JobSeekersController {

	private JobSeekerService service;

	@Autowired
	public JobSeekersController(JobSeekerService service) {
		super();
		this.service = service;
	}
	@PostMapping(value = "/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.service.add(jobSeeker);
	}
	
	@GetMapping(value = "/getById")
	public DataResult<JobSeeker> getById(@RequestParam int id) {
		return this.service.getById(id);
	}
	
	
	@GetMapping(value = "/getAll")
	public DataResult<List<JobSeeker>> getAll() {
		return this.service.getAll();
	}
	
	@GetMapping(value = "/getByEmail")
	public DataResult<JobSeeker> getByEmail(@RequestParam String email) {
		return this.service.getByEmail(email);
	}
	
	@GetMapping(value = "/getByNationalityId")
	public DataResult<JobSeeker> getByNationalityId(@RequestParam String nationalityId) {
		return this.service.getByNationalityId(nationalityId);
	}

}
