package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemWorkerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemWorker;

@RestController
@RequestMapping(value = "/api/systemWorkers")
public class SystemWorkersController {
	
	private SystemWorkerService systemWorkerService;
	
	@Autowired
	public SystemWorkersController(SystemWorkerService systemWorkerService) {
		super();
		this.systemWorkerService = systemWorkerService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody SystemWorker systemWorker) {
		return this.systemWorkerService.add(systemWorker);
	}
	
	@GetMapping(value = "/getWorkerWithEmail")
	public DataResult<SystemWorker> getByEmail(@RequestParam String email) {
		return this.systemWorkerService.getByEmail(email);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<SystemWorker>> getAll() {
		return this.systemWorkerService.getAll();
	}

}
