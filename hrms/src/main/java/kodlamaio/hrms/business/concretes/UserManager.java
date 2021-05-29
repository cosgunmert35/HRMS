package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

}
