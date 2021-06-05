package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.PhoneNumberService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.PhoneNumber;

@RestController
@RequestMapping(value = "/api/phoneNumbers")
public class PhoneNumbersController {
	
	private PhoneNumberService phoneNumberService;
	
	@Autowired
	public PhoneNumbersController(PhoneNumberService phoneNumberService) {
		super();
		this.phoneNumberService = phoneNumberService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody PhoneNumber phoneNumber) {
		return this.phoneNumberService.add(phoneNumber);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<PhoneNumber>> getAll() {
		return this.phoneNumberService.getAll();
	}

}
