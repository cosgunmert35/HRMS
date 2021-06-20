package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "job_advertisements")
@NoArgsConstructor
@AllArgsConstructor

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobAdvertisements" })
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "employer_id", insertable = false, updatable = false)
	private Employer employer;

	@ManyToOne
	@JoinColumn(name = "jobPosition_id", insertable = false, updatable = false)
	private JobPosition jobPosition;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "city_id", insertable = false, updatable = false)
	private City city;

	@Column(name = "minimum_Salary")
	private String minimumSalary;

	@Column(name = "maximum_salary")
	private String maximumSalary;

	@Column(name = "quota")
	private int quota;

	@Column(name = "create_date", columnDefinition = "DATE")
	private LocalDate createDate;
	
	@Column(name = "expire_date")
	private LocalDate expireDate;
	

	@Column(name = "is_active")
	private boolean isActive;

}
