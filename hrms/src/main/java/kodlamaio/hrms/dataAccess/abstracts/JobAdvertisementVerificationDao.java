package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisementVerification;

public interface JobAdvertisementVerificationDao extends JpaRepository<JobAdvertisementVerification, Integer> {

	@Query("From JobAdvertisementVerification Where id = :id")
	JobAdvertisementVerification getByJobAdvertisementVerificationId(int id);
}
