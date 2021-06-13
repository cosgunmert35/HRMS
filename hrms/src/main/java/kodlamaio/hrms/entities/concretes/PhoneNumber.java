package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "phone_numbers")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PhoneNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	/*
	 * @Column(name = "employer_id") private int employerId;
	 */

	@ManyToOne
	@JoinColumn(name = "employer_id", insertable = false, updatable = false)
	private Employer employer;

	@Column(name = "phone_number")
	private String phoneNumber;
}
