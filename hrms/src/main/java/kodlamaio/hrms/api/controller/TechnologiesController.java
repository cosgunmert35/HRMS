package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Technology;

@RestController
@RequestMapping(value = "/api/technologies")
public class TechnologiesController {

	private TechnologyService service;

	public TechnologiesController(TechnologyService service) {
		super();
		this.service = service;
	}

	@PostMapping(value = "/add")
	public Result add(@RequestBody Technology technology) {
		return this.service.add(technology);
	}

	@GetMapping("/getAll")
	public DataResult<List<Technology>> getAll() {
		return this.service.getAll();
	}
}
