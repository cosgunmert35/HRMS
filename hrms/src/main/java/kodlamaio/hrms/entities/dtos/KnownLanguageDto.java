package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KnownLanguageDto {

	private int id;
	private int jobSeekerId;
	private String languageName;
	private int experience;

}
