package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.LinkedAccount;

public interface LinkedAccountDao extends JpaRepository<LinkedAccount, Integer>{
	
	
	List<LinkedAccount> getByResumeId(int resumeId);

}
