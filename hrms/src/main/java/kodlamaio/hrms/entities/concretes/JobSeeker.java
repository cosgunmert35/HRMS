package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "id")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobSeeker"})
public class JobSeeker extends User {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@Column(name = "nationality_id")
	private String nationalityId;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Resume> resumes;

	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<Photo> photos;

}
