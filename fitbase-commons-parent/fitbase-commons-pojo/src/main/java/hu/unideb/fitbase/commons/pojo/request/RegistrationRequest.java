package hu.unideb.fitbase.commons.pojo.request;

import hu.unideb.fitbase.commons.pojo.enumeration.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegistrationRequest implements Serializable {

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
