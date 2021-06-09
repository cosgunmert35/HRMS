package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import kodlamaio.hrms.entities.concretes.WorkExperiance;

public interface WorkExperianceDao extends JpaRepository<WorkExperiance, Integer> {
	
	@Query("Select w.id, j.id, p.id, p.positionName, w.workplaceName, w.startDate, w.leaveDate "
			+ "From WorkExperiance w Inner Join w.jobSeeker j "
			+ "Inner join w.jobPosition p Where j.id=:jobSeekerId")
	List<WorkExperiance> findByJobSeeker(int jobSeekerId);
	
	/*
	@Query("Select w.id, j.id, p.id, p.positionName, w.workplaceName "
			+ "From WorkExperiance w Inner Join w.jobSeeker j "
			+ "Inner join w.jobPosition p Where j.id=:jobSeekerId"
			+ "Order By w.leaveDate DESC")
	List<WorkExperiance> findByJobSeekerOrderByLeaveDate(int jobseekerid);
	
	*/
	
	
	@Query("Select w.id, j.id, p.id, p.positionName, w.workplaceName, w.startDate, w.leaveDate "
			+ "From WorkExperiance w Inner Join w.jobSeeker j Inner Join w.jobPosition p "
			+ "Where j.id=:jobSeekerId Order By w.leaveDate DESC")
	List<WorkExperiance> findByJobSeekerAndLeaveDateOrderBy(int jobSeekerId);
}
