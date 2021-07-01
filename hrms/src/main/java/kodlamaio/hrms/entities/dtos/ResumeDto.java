package kodlamaio.hrms.entities.dtos;

//kodlamaio.hrms.entities.dtos.ResumeDto()

import java.time.LocalDate;
import java.util.List;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.KnownLanguage;
import kodlamaio.hrms.entities.concretes.KnownTechnology;
import kodlamaio.hrms.entities.concretes.LinkedAccount;
import kodlamaio.hrms.entities.concretes.School;
import kodlamaio.hrms.entities.concretes.Summary;
import kodlamaio.hrms.entities.concretes.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
			
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeDto {
	private int id;
	private JobSeeker jobSeeker;
	private List<School> schools;
	private List<WorkExperience> workExperiences;
	private List<KnownLanguage> knownLanguages;
	private List<LinkedAccount> linkedAccounts;
	private List<KnownTechnology> knownTechnologies;
	private List<Summary> summaries;
	
	/*
	 * private int jobSeekerId; private String firstName; private String lastName;
	 * private String title; private String schoolName; private String department;
	 * private LocalDate startDate; private LocalDate dateOfGraduation; private
	 * String workplaceName; private String positionName; private LocalDate
	 * workStratDate; private LocalDate leaveDate; private String languageName;
	 * private int languageExperience; private String accountName; private String
	 * accountLink; private String technologyName; private String summary;
	 */
	
	/*
	 * private List<School> schools; private List<WorkExperience> workExperiences;
	 * private List<KnownLanguage> knownLanguages; private List<LinkedAccount>
	 * linkedAccounts; private List<KnownTechnology> knownTechnologies; private
	 * List<Summary> summaries;
	 */
	
	
	
	
	
	
	
	
}
