package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import kodlamaio.hrms.entities.concretes.KnownLanguage;

public interface KnownLanguageDao extends JpaRepository<KnownLanguage, Integer> {	
	
	@Query("Select k.id, j.id, l.languageName "
			+ "From KnownLanguage k Inner Join k.jobSeeker j "
			+ "Inner join k.language l Where j.id=:jobSeekerId")
	KnownLanguage findByJobSeeker(int jobSeekerId);
	
	/*
	 * SELECT kl.id, kl.job_seeker_id, js.first_name, kl.language_id, l.language_name,kl.experiance FROM job_seekers js 
	 * INNER JOIN known_languages kl ON js.id = kl.job_seeker_id
	 * INNER JOIN languages l ON l.id = kl.language_id
	 * WHERE kl.job_seeker_id = 1
	 */
}
