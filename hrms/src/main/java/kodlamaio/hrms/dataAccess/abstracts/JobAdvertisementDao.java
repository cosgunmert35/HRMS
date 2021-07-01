package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	List<JobAdvertisement> getByIsActive(boolean isActive);
	
	@Query("From JobAdvertisement Where id=:id")
	JobAdvertisement getByJobAdvertisement_Id(int id);
	
	@Query("From JobAdvertisement Where isActive=true Order By expireDate DESC")
	List<JobAdvertisement> getByIsActiveAndSortedDate();
	
	
	List<JobAdvertisement> getByIsActiveAndEmployer_CompanyName(boolean isActive, String companyName);
	
	@Modifying
	@Query("Update JobAdvertisement Set isActive=false Where id = :id And employerId = :employerId")
	JobAdvertisement deactiveJobAdvertisement(int id, int employerId);
}
