package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.KnownTechnology;

public interface KnownTechnologyDao extends JpaRepository<KnownTechnology, Integer>{
	
	@Query("Select k.id, j.id, t.id ,t.technologyName "
			+ "From KnownTechnology k Inner Join k.jobSeeker j "
			+ "Inner join k.technology t Where j.id=:jobSeekerId")
	List<KnownTechnology> findByJobSeeker(int jobSeekerId);

}
