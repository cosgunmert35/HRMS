package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "resumes")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "school"})
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "jobSeeker_id",insertable = false , updatable = false)
	private JobSeeker jobSeeker;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "create_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDate createDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<School> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<WorkExperience> workExperiences;

	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<KnownLanguage> knownLanguages;

	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<LinkedAccount> linkedAccounts;

	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<KnownTechnology> knownTechnologies;

	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<Summary> summaries;

	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<Photo> photos;
	
}
