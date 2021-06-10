package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkExperience;

@RestController
@RequestMapping(value = "/api/workExperiences")
public class WorkExperiencesController {
	
	private WorkExperienceService experienceService;
	
	@Autowired
	public WorkExperiencesController(WorkExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody WorkExperience workExperience) {
		return this.experienceService.add(workExperience);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<WorkExperience>> getAll() {
		return this.experienceService.getAll();
	}
	
	@GetMapping(value = "/getAllSortedLeaveDate")
	public DataResult<List<WorkExperience>> getAllSortedLeaveDate() {
		return this.experienceService.getAllSortedLeaveDate();
	}
}
