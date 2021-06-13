package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.Resume;
import kodlamaio.hrms.entities.dtos.ResumeDto;

public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	List<Resume> getByJobSeekerId(int id);
	// hata veriyor sebebi araştırılacak
	/*@Query(value = "Select r.id, j.id, j.firstName, j.lastName, r.title, "
			+ "sc.schoolName, sc.department, sc.startData, sc.dateOfGraduation, "
			+ "we.workpalceName, jp.positionName, we.startDate, we.leaveDate, "
			+ "lng.languageName, kl.experience, atype.typeName, la.accountLink, tech.technologyName, sm.summary "
			+ "From from JobSeeker As j"
			+ "	Inner Join Resume As r ON r.jobSeeker = j.resumes"
			+ "	Inner Join School As sc ON sc.resume = r.schools"
			+ "	Inner Join WorkExperience As we ON we.resume = r.workExperiences"
			+ "	Inner Join JobPosition As jp ON jp.workExperiences = we.jobPosition"
			+ "	Inner Join KnownLanguage As kl ON kl.resume = r.knownLanguages"
			+ "	Inner Join Language lng As On lng.knownwLanguages = kl.language"
			+ "	Inner Join LinkedAccount As la ON la.resume = r.linkedAccounts"
			+ "	Inner Join AccountType As atype On atype.linkedAccounts = la.accountType"
			+ "	Inner Join KnownTechnology As kt ON kt.resume = r.knownTechnologies"
			+ "	Inner Join Technology As tech ON tech.knownTechnologies = kt.technology"
			+ "	Inner Join Summary As sm ON sm.resume = r.summaries", nativeQuery = true)
	List<ResumeDto> getByResumeDto();
	*/
/*
	@Query("Select new kodlamaio.hrms.entities.dtos.ResumeDto("
			+ "r.id, j.id, j.firstName, j.lastName, r.title, sc.schoolName, sc.department, sc.startData, sc.dateOfGraduation,"
			+ "we.workpalceName, jp.positionName, we.startDate, we.leaveDate, lng.languageName, kl.experience,"
			+ "atype.typeName, la.accountLink, tech.technologyName, sm.summary) "
			+ "From Resume r "
			+ "Inner Join r.jobSeeker j "
			+ "Inner Join r.schools sc "
			+ "Inner Join r.workExperiences we "
			+ "Inner Join we.jobPosition jp "
			+ "Inner Join r.knownLanguages kl "
			+ "Inner Join kl.language lng "
			+ "Inner Join r.linkedAccounts la "
			+ "Inner Join la.accountType atype "
			+ "Inner Join r.knownTechnologies kt "
			+ "Inner Join kt.technology tech "
			+ "Inner Join r.summaries sm")
	List<ResumeDto> getByResumeDto();
	*/
	/*
	Select r.id, j.id, j.first_name, j.last_name, r.title, 
	sc.school_name, sc.department, sc.start_date, sc.date_of_graduation,
	we.workpalce_name, jp.position_name, we.start_date, we.leave_date,
	lng.language_name, kl.experience, atype.type_name, la.account_link,
	tech.technology_name, sm.summary
	from job_seekers j 
	Inner Join resumes r ON r.job_seeker_id = j.id 
	Inner Join schools sc ON sc.resume_id = r.id 
	Inner Join work_experiences we ON we.resume_id = r.id
	Inner Join job_positions jp ON jp.id = we.job_position_id
	Inner Join known_languages kl ON kl.resume_id = r.id
	Inner Join languages lng On lng.id = kl.language_id
	Inner Join linked_accounts la ON la.resume_id = r.id
	Inner Join account_types atype On atype.id = la.account_type_id
	Inner Join known_technologies kt ON kt.resume_id = r.id
	Inner Join technologies tech ON tech.id = kt.technology_id
	Inner Join summaries sm ON sm.resume_id = r.id
	Where j.id = 1 And r.id =1
	
	*/
	
	/*
	@Query("Select * From JobSeeker j Inner Join j.resumes r"
			+ "Inner Join r.schools s Inner ")
	Resume getByResumeDto();*/
	/*
	@Query("Select * From JobSeeker j Inner Join j.resumes r"
			+ "Inner Join r.schools s Inner Join")
	List<ResumeDto> getByResumeDto();
	*/
	
	
	
	 
	
	/*
	 * @Query("Select new kodlamaio.hrms.entities.dtos.ResumeDto(r.id, j.id, j.first_name, j.last_name, r.title,sc.school_name,"
	 * + " sc.department, sc.start_date, sc.date_of_graduation," +
	 * " we.workpalce_name, jp.position_name, we.start_date, we.leave_date," +
	 * " lng.language_name, kl.experience, atype.type_name, la.account_link, tech.technology_name, sm.summary)"
	 * +
	 * " From Resume r Inner Join r.jobSeeker j Inner Join r.schools sc Inner Join r.workExperiences we Inner Join we.jobPosition jp"
	 * + " Inner Join r.knownLanguages kl Inner Join k.language lng " +
	 * " Inner Join r.linkedAccounts la Inner Join la.accountType atype Inner Join r.knownTechnologies kt Inner Join kt.technology tech Inner Join r.summaries sm"
	 * + " Where j.id = :jobSeekerId And r.id = :resumeId")
	 */
	
	/*
	 * @Query(value =
	 * "Select r.id, j.id, j.first_name, j.last_name, r.title, sc.school_name,sc.department, sc.start_date, sc.date_of_graduation, we.workpalce_name, jp.position_name, we.start_date, we.leave_date, lng.language_name, kl.experience, atype.type_name, la.account_link, tech.technology_name, sm.summary"
	 * + " From Resume r Inner Join JobSeeker j ON r.jobSeeker = j.resumes" +
	 * " Inner Join School sc ON sc.resume = r.schools" +
	 * "	Inner Join WorkExperience we ON we.resume = r.workExperiences"+
	 * "	Inner Join JobPosition jp ON jp.workExperiences = we.jobPosition" +
	 * "	Inner Join KnownLanguage kl ON kl.resume = r.knownLanguages" +
	 * "	Inner Join Language lng On lng.knownLanguages = kl.language" +
	 * "	Inner Join LinkedAccount la ON la.resume = r.linkedAccounts" +
	 * "	Inner Join AccountType atype On atype.linkedAccounts = la.accountType" +
	 * "	Inner Join KnownTechnology kt ON kt.resume = r.knownTechnologies" +
	 * "	Inner Join Technology tech ON tech.knownTechnologies = kt.technology" +
	 * "	Inner Join Summary sm ON sm.resume = r.summaries", nativeQuery = true)
	 */
}






