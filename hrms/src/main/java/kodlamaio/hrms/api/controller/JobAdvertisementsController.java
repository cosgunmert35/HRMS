package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDetailDto;
import kodlamaio.hrms.entities.dtos.JobAdvertisementSaveDto;

@RestController
@RequestMapping(value = "/api/jobAdvertisements")
public class JobAdvertisementsController {

	private JobAdvertisementService advertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService advertisementService) {
		super();
		this.advertisementService = advertisementService;
	}
	
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody JobAdvertisementSaveDto advertisementSaveDto) {
		return this.advertisementService.add(advertisementSaveDto);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.advertisementService.getAll();
	}

	@GetMapping(value = "/getById")
	public DataResult<JobAdvertisement> getById(@RequestParam(name = "id") int id) {
		return this.advertisementService.getByJobAdvertisement_Id(id);
	}

	@GetMapping(value = "/getByIsActive")
	public DataResult<List<JobAdvertisement>> getByIsActive(@RequestParam boolean isActive) {
		return this.advertisementService.getByIsActive(isActive);
	}

	@GetMapping(value = "/getBySortedDate")
	public DataResult<List<JobAdvertisement>> getBySortedDate() {
		return this.advertisementService.getBySortedDate();
	}

	@GetMapping(value = "/getByIsActiveAndEmployer_CompanyName")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(
			@RequestParam(name = "isActive") boolean isActive, @RequestParam(name = "companyName") String companyName) {
		return this.advertisementService.getByIsActiveAndEmployer_CompanyName(isActive, companyName);
	}
	
	@PutMapping(value = "/update")
	public Result update(@RequestBody JobAdvertisementSaveDto advertisementSaveDto) {
		 return this.advertisementService.update(advertisementSaveDto);
	 }
	
	@GetMapping(value = "/getAllWithDto")
	public DataResult<List<JobAdvertisementDetailDto>> getAllWithDto() {
		return this.advertisementService.getAllWithDto();
	}

}
