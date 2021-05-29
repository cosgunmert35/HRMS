package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService service;

	public UsersController(UserService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/getAll")
	public List<User> getAll() {
		return this.service.getAll();
	}
	

}
