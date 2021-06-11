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
	
	private KnownTechnologyService technologyService;
	
	@Autowired
	public KnownTechnologiesController(KnownTechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody KnownTechnology knownTechnology) {
		return this.technologyService.add(knownTechnology);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<KnownTechnology>> getAll() {
		return this.technologyService.getAll();
	}
	
	@GetMapping(value = "/getByResumeId")
	public DataResult<List<KnownTechnology>> getByResumeId(@RequestParam int resumeId) {
		return this.technologyService.getByResumeId(resumeId);
	}
}
