package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;

@RestController
@RequestMapping(value = "/api/schools")
public class SchoolsController {
	
	private SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<School>> getAll() {
		return this.schoolService.getAll();
	}
	
	@GetMapping(value = "/getAllSortedDate")
	public DataResult<List<School>> getAllSortedDate() {
		return this.schoolService.getAllSortedDate();
	}

}
