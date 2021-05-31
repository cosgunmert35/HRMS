package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping(value = "/api/jobPositions")
public class JobPositionsController {
	
	private JobPositionService service;

	public JobPositionsController(JobPositionService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(value = "/getAll")
	public DataResult<List<JobPosition>> getAll() {
		return this.service.getAll();
	}
	
	
	 @PostMapping(value = "/add") 
	 public Result add(@RequestBody JobPosition position) {
		 return this.service.add(position);
	 
	 }
	 

}
