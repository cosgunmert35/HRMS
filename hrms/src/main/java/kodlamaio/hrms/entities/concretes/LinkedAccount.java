package kodlamaio.hrms.entities.concretes;

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

@Entity
@Table(name = "linked_accounts")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkedAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	private JobSeeker jobSeeker;
	
	@ManyToOne
	private AccountType accountType;
	
	@Column(name = "address")
	private String address;
	
	@ManyToOne
	private Resume resume;
}
