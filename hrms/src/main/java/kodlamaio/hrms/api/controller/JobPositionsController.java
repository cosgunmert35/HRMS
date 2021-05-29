package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {
	
	private JobPositionService service;

	public JobPositionsController(JobPositionService service) {
		super();
		this.service = service;
	}
	
	
	@RequestMapping("/getAll")
	public List<JobPosition> getAll() {
		return this.service.getAll();
	}

}
