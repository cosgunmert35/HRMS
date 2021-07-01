package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.WorkingModel;

public interface WorkingModelDao extends JpaRepository<WorkingModel, Integer> {
	
	
	@Query("From WorkingModel Where id = :id")
	WorkingModel getByWoringModelId(int id);

}
