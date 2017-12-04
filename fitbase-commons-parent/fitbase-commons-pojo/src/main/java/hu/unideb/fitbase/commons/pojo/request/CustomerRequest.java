package hu.unideb.fitbase.commons.pojo.request;

import java.io.Serializable;
import java.util.Date;

import hu.unideb.fitbase.commons.pojo.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CustomerRequest implements Serializable{

	private static final long serialVersionUID = 5469117100559583062L;

	private String email;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private Date birthdayDate;
	
	private Gender gender;

}
