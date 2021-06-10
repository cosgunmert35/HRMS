package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "work_experiences")
public class WorkExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	private Resume resume;

	@ManyToOne
	private JobPosition jobPosition;
	
	@Column(name = "workplace_name")
	private String workplaceName;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column(name = "leave_date")
	private LocalDate leaveDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	

}
