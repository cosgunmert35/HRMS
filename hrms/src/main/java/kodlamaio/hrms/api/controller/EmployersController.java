package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping(value = "/api/employers")
public class EmployersController {
	
	private EmployerService service;

	public EmployersController(EmployerService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<Employer>> getAll() {
		return this.service.getAll();
	}
	

}
