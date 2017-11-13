package hu.unideb.fitbase.commons.pojo.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GymRequest implements Serializable {

	private static final long serialVersionUID = -8553242064012405370L;

	private String name;

	private String city;

	private String address;

	private String zipCode;

	private String description;

	private String openingHours;
}
