package kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> findByIsActive(boolean isActive);
	
	List<JobAdvertisement> findByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName);
	
	@Query("FROM JobAdvertisement WHERE isActive = true ORDER BY createDate DESC")
	List<JobAdvertisement> findByIsActiveCreateDateOrderByDESC();
	
	@Modifying
	@Query("UPDATE JobAdvertisement j SET j.isActive = :isActive WHERE j.id = :id")
	JobAdvertisement updateIsActiveStatus(int id, boolean isActive);
	
	
	
}
