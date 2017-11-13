package hu.unideb.fitbase.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserModificationRequest implements Serializable{

	private static final long serialVersionUID = -5988468099465835248L;

	private String email;

    private String password;

    private String passwordConfirm;

    private String firstName;

    private String lastName;
}
