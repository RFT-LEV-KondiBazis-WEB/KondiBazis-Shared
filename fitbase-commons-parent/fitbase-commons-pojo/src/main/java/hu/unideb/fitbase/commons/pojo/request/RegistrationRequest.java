package hu.unideb.fitbase.commons.pojo.request;

import hu.unideb.fitbase.commons.pojo.enumeration.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegistrationRequest implements Serializable {

	private static final long serialVersionUID = 4197255010441394121L;

	private String username;

    private String email;

    private String password;

    private String passwordConfirm;

    private String firstName;

    private String lastName;

    private String rememberToken;

    private LocalDate createdDate;

    private UserRole userRole;
}
