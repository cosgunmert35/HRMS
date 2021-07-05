package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementDetailDto {

	private int id;
	private String employerCompanyName;
	private String positionName;
	private String description;
	private String cityName;
	private double minimumSalary;
	private double maximumSalary;
	private int quota;
	private boolean isHomeOffice;
	private String modelName;
	private LocalDate createDate;
	private LocalDate expireDate;
	private boolean isActive;
}
