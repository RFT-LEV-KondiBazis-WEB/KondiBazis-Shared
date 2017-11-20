package hu.unideb.fitbase.commons.pojo.request;

import hu.unideb.fitbase.commons.pojo.enumeration.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ManagerRegistrationRequest {

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