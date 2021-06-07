package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.WorkExperiance;

public interface WorkExperianceDao extends JpaRepository<WorkExperiance, Integer> {
	
	// @Query("FROM WorkExperiance WHERE jobSeeker.jobSeekerId")
	WorkExperiance getByJobSeeker(int jobSeekerId);
	
}
