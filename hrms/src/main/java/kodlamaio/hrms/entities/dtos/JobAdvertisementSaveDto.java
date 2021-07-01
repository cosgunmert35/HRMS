package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementSaveDto {
	
	private int id;
	private int employerId;
	private int jobPositionId;
	private String description;
	private int cityId;
	private double minimumSalary;
	private double maximumSalary;
	private int quota;
	private boolean isHomeOffice;
	private int workingModelId;
	private LocalDate createDate = LocalDate.now();
	private LocalDate expireDate;
	private boolean isActive;
	

}
