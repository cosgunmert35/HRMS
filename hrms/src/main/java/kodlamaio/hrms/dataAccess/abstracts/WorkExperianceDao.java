package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.WorkExperiance;

public interface WorkExperianceDao extends JpaRepository<WorkExperiance, Integer> {
	
	@Query("Select w.id, j.id, p.id, p.positionName, w.workplaceName "
			+ "From WorkExperiance w Inner Join w.jobSeeker j "
			+ "Inner join w.jobPosition p Where j.id=:jobSeekerId")
	List<WorkExperiance> getByJobSeeker(int jobSeekerId);
	
	/*
	 @Query("Select k.id, j.id, t.id ,t.technologyName "
			+ "From KnownTechnology k Inner Join k.jobSeeker j "
			+ "Inner join k.technology t Where j.id=:jobSeekerId")
	 */
	
}
