package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	JobSeeker getByEmail(String email);
	
	JobSeeker getByNationalityId(String nationalityId);
	
	@Query(value = "From JobSeeker Where id = :id")
	JobSeeker getById(int id);
	
	
}
