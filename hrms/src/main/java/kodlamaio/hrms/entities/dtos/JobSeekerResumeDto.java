package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.KnownLanguage;
import kodlamaio.hrms.entities.concretes.KnownTechnology;
import kodlamaio.hrms.entities.concretes.LinkedAccount;
import kodlamaio.hrms.entities.concretes.Photo;
import kodlamaio.hrms.entities.concretes.School;
import kodlamaio.hrms.entities.concretes.Summary;
import kodlamaio.hrms.entities.concretes.WorkExperiance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerResumeDto {
	
	private String firstName;
	private String lastName;
	private List<School> schools;
	private List<WorkExperiance> workExperiances;
	private List<KnownLanguage> knownLanguages;
	private List<Photo> photos;
	private List<LinkedAccount> linkedAccounts;
	private List<KnownTechnology> knownTechnologies;
	private List<Summary> summaries;

}
