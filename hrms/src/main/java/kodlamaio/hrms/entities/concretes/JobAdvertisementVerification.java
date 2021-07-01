package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "job_advertisement_verifications")
public class JobAdvertisementVerification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_advertisement_id", referencedColumnName = "id", insertable = false, updatable = false)
	private JobAdvertisement jobAdvertisement;
	
	@ManyToOne
	@JoinColumn(name = "system_worker_id")
	private SystemWorker systemWorker;
	
	@Column(name = "is_verify")
	private boolean isVerify;
	
	@Column(name = "verification_date", columnDefinition = "DATE")
	private LocalDate verificationDate;

}
