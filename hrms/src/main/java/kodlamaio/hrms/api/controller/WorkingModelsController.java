package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkingModelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.WorkingModel;

@RestController
@RequestMapping(value = "/api/workingModels")
public class WorkingModelsController {
	
	private WorkingModelService modelService;
	
	@Autowired
	public WorkingModelsController(WorkingModelService modelService) {
		super();
		this.modelService = modelService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody WorkingModel workingModel) {
		return this.modelService.add(workingModel);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<WorkingModel>> getAll() {
		return this.modelService.getAll();
	}
	
	@GetMapping(value = "/getById")
	public DataResult<WorkingModel> getByWoringModelId(@RequestParam int id) {
		return this.modelService.getByWoringModelId(id);
	}
	

}
