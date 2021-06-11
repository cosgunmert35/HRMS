package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.KnownLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.KnownLanguage;

@RestController
@RequestMapping(value = "/api/knownLanguages")
public class KnownLanguagesController {
	
	private KnownLanguageService knownLanguageService;

	@Autowired
	public KnownLanguagesController(KnownLanguageService knownLanguageService) {
		super();
		this.knownLanguageService = knownLanguageService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody KnownLanguage knownLanguage) {
		return this.knownLanguageService.add(knownLanguage);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<KnownLanguage>> getAll() {
		return this.knownLanguageService.getAll();
	}
	
	@GetMapping(value = "/getByResumeId")
	public DataResult<List<KnownLanguage>> getByResumeId(@RequestParam int resumeId) {
		return this.knownLanguageService.getByResumeId(resumeId);
	}
	
	

}
