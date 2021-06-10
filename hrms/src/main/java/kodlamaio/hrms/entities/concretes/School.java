package kodlamaio.hrms.entities.concretes;

import javax.persistence.Table;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "schools")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	private Resume resume;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column(name = "date_of_graduation")
	private LocalDate dateOfGraduation;
	
	@Column(name = "is_active")
	private boolean isActive;

}
