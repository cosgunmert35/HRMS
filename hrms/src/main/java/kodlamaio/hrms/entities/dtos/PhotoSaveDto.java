package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhotoSaveDto {
	
	private int jobSeekerId;
	
	private int resumeId;
	
	private String photoLink;

}
