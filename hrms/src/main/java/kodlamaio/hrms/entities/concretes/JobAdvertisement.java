package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne(targetEntity = Employer.class, optional = false)
	@JoinColumn(name = "employer_id", nullable = false)
	private Employer employer;

	@ManyToOne(targetEntity = JobPosition.class, optional = false)
	@JoinColumn(name = "job_position_id", nullable = false)
	private JobPosition jobPosition;

	@Column(name = "description")
	private String description;

	@ManyToOne(targetEntity = City.class, optional = false)
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

	@Column(name = "minimum_salary")
	private double minimumSalary;

	@Column(name = "maximum_salary")
	private double maximumSalary;

	@Column(name = "quota")
	private int quota;

	@Column(name = "is_home_office")
	private boolean isHomeOffice;

	@ManyToOne(targetEntity = WorkingModel.class, optional = false)
	@JoinColumn(name = "working_model_id", nullable = false)
	private WorkingModel workingModel;

	@Column(name = "create_date", columnDefinition = "DATE")
	private LocalDate createDate;

	@Column(name = "expire_date", columnDefinition = "DATE")
	private LocalDate expireDate;

	@Column(name = "is_active")
	private boolean isActive;

	@JsonIgnore
	@OneToOne(mappedBy = "jobAdvertisement")
	private JobAdvertisementVerification jobAdvertisementVerification;

}
