package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Summary;

public interface SummaryDao extends JpaRepository<Summary, Integer> {
	
	List<Summary> getByResumeId(int resumeId);
}
