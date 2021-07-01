package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Resume;
import kodlamaio.hrms.entities.dtos.ResumeDto;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	List<Resume> getByJobSeekerId(int id);
	// hata veriyor sebebi araştırılacak
	
	@Query(value = "SELECT * FROM resume_views", nativeQuery = true)
	List<ResumeDto> getByResumeDto();

}






