package kodlamaio.hrms.api.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService advertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService advertisementService) {
		super();
		this.advertisementService = advertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement advertisement) {
		return this.advertisementService.add(advertisement);
	}
	
	@PostMapping("/updateIsActiveStatus")
	public Result updateIsActiveStatus(@RequestBody int id, @RequestBody boolean isActive) {
		return this.updateIsActiveStatus(id, isActive);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.advertisementService.getAll();
	}
	
	
	@GetMapping("/findByIsActive")
	public DataResult<List<JobAdvertisement>> findByIsActive(@RequestParam boolean isActive) {
		return this.advertisementService.findByIsActive(isActive);
	}
	
	@GetMapping("/findByIsActiveCreateDateOrderByDESC")
	public DataResult<List<JobAdvertisement>> findByIsActiveCreateDateOrderByDESC(){
		return this.advertisementService.findByIsActiveCreateDateOrderByDESC();
	}
	
	@GetMapping("/findByIsActiveAndEmployer_CompanyName")
	public DataResult<List<JobAdvertisement>> findByIsActiveAndEmployer_CompanyName(@RequestParam boolean isActive,
			@RequestParam String companyName) {
		return this.advertisementService.findByIsActiveAndEmployer_CompanyName(isActive, companyName);
	}
	
	
	

}
