package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping(value = "/api/users")
public class UsersController {
	
	private UserService service;

	public UsersController(UserService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(value = "/getAll")
	public DataResult<List<User>> getAll() {
		return this.service.getAll();
	}
	

}
