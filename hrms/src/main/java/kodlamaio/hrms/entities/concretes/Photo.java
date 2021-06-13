package kodlamaio.hrms.entities.concretes;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "photos")
public class Photo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "jobSeeker_id", insertable = false, updatable = false)
	private JobSeeker jobSeeker;
	
	@ManyToOne
	@JoinColumn(name = "resume_id", insertable = false, updatable = false)
	private Resume resume;
	
	@Column(name = "photo_link")
	private String photoLink;
}
