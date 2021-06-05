package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.AccountTypeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.AccountType;

@RestController
@RequestMapping(value = "/api/accountTypes")
public class AccountTypesController {
	
	private AccountTypeService accountTypeService;

	public AccountTypesController(AccountTypeService accountTypeService) {
		super();
		this.accountTypeService = accountTypeService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestBody AccountType accountType) {
		return this.accountTypeService.add(accountType);
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<AccountType>> getAll() {
		return this.accountTypeService.getAll();
	}

}
