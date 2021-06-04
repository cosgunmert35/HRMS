package kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> findByIsActive(boolean isActive);
	
	// Query ile duzenlenecek
	List<JobAdvertisement> findByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName);
	
	@Query("FROM JobAdvertisement WHERE isActive = true ORDER BY createDate DESC")
	List<JobAdvertisement> findByIsActiveCreateDateOrderByDESC();
	
	@Modifying
	@Query("UPDATE JobAdvertisement j SET j.isActive = :isActive WHERE j.id = :id")
	JobAdvertisement updateIsActiveStatus(int id, boolean isActive);
	
	//package kodlamaio.hrms.entities.dtos
	
	
	@Query(value = "SELECT new kodlamaio.hrms.entities.dtos.JobAdvertisementDto(ja.id, e.companyName, jp.positionName, ja.quota, ja.createDate, ja.expireDate) "
			+ "FROM Employer e INNER JOIN JobAdvertisement ja ON e.jobAdvertisements = ja.employer INNER JOIN JobPosition jp ON jp.advertisements = ja.jobPosition",
			nativeQuery = true)
	List<JobAdvertisement> findByJobAdvertisementsDto();
	
	
}
