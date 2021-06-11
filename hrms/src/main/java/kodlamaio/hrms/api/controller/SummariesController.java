package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SummaryService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Summary;

@RestController
@RequestMapping(value = "/api/summaries")
public class SummariesController {
	
	private SummaryService service;
	
	@Autowired
	public SummariesController(SummaryService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody Summary summary) {
		return this.service.add(summary);
	}
	
	@GetMapping(value = "/getByResumeId")
	public DataResult<List<Summary>> getByResumeId(@RequestParam int resumeId) {
		return this.service.getByResumeId(resumeId);
	}

}
