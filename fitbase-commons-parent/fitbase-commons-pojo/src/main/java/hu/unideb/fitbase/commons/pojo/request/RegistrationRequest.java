package hu.unideb.fitbase.commons.pojo.request;

import hu.unideb.fitbase.commons.pojo.enumeration.UserRole;
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class RegistrationRequest implements Serializable {

    private String username;

    private String email;

    private String password;

    private String passwordConfirm;

    private String firstName;

    private String lastName;

    private String rememberToken;

    private boolean enabled;

    private Date lastPasswordResetDate;

    private LocalDate createdDate;

    private UserRole userRole;

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public static RegistrationRequest.RegistrationRequestBuilder builder() {
        return new RegistrationRequest.RegistrationRequestBuilder();
    }


    public static final class RegistrationRequestBuilder {
        private RegistrationRequest registrationRequest;

        private RegistrationRequestBuilder() {
            registrationRequest = new RegistrationRequest();
        }

        public static RegistrationRequestBuilder aRegistrationRequest() {
            return new RegistrationRequestBuilder();
        }

        public RegistrationRequestBuilder username(String username) {
            registrationRequest.setUsername(username);
            return this;
        }

        public RegistrationRequestBuilder email(String email) {
            registrationRequest.setEmail(email);
            return this;
        }

        public RegistrationRequestBuilder password(String password) {
            registrationRequest.setPassword(password);
            return this;
        }

        public RegistrationRequestBuilder firstName(String firstName) {
            registrationRequest.setFirstName(firstName);
            return this;
        }

        public RegistrationRequestBuilder lastName(String lastName) {
            registrationRequest.setLastName(lastName);
            return this;
        }

        public RegistrationRequestBuilder rememberToken(String rememberToken) {
            registrationRequest.setRememberToken(rememberToken);
            return this;
        }

        public RegistrationRequestBuilder lastPasswordResetDate(Date lastPasswordResetDate) {
            registrationRequest.setLastPasswordResetDate(lastPasswordResetDate);
            return this;
        }

        public RegistrationRequestBuilder createdDate(LocalDate createdDate) {
            registrationRequest.setCreatedDate(createdDate);
            return this;
        }

        public RegistrationRequestBuilder userRole(UserRole userRole) {
            registrationRequest.setUserRole(userRole);
            return this;
        }

        public RegistrationRequestBuilder but() {
            return aRegistrationRequest().username(registrationRequest.getUsername()).email(registrationRequest.getEmail()).password(registrationRequest.getPassword()).firstName(registrationRequest.getFirstName()).lastName(registrationRequest.getLastName()).rememberToken(registrationRequest.getRememberToken()).lastPasswordResetDate(registrationRequest.getLastPasswordResetDate()).createdDate(registrationRequest.getCreatedDate()).userRole(registrationRequest.getUserRole());
        }

        public RegistrationRequest build() {
            return registrationRequest;
        }
    }
}
