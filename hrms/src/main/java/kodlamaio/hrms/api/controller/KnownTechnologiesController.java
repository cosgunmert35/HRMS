package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.KnownTechnologyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.KnownTechnology;

@RestController
@RequestMapping(value = "/api/knownTechnologies")
public class KnownTechnologiesController {
	
	private KnownTechnologyService knownTechnologyService;
	
	@Autowired
	public KnownTechnologiesController(KnownTechnologyService knownTechnologyService) {
		super();
		this.knownTechnologyService = knownTechnologyService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody KnownTechnology knownTechnology) {
		return this.knownTechnologyService.add(knownTechnology);
	}
	
	@GetMapping(value = "/findByJobSeeker")
	public DataResult<List<KnownTechnology>> findByJobSeeker(@RequestParam int jobSeekerId) {
		return this.knownTechnologyService.findByJobSeeker(jobSeekerId);
	}

}
