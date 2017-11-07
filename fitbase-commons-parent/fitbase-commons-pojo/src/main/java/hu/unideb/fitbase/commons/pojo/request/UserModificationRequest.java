package hu.unideb.fitbase.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserModificationRequest {
    private String email;

    private String password;

    private String passwordConfirm;

    private String firstName;

    private String lastName;

    public static UserModificationRequest.UserModificationRequestBuilder builder() {
        return new UserModificationRequest.UserModificationRequestBuilder();
    }

    public static final class UserModificationRequestBuilder {
        private String email;
        private String password;
        private String passwordConfirm;
        private String firstName;
        private String lastName;

        private UserModificationRequestBuilder() {
        }

        public static UserModificationRequestBuilder anUserModificationRequest() {
            return new UserModificationRequestBuilder();
        }

        public UserModificationRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserModificationRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserModificationRequestBuilder passwordConfirm(String passwordConfirm) {
            this.passwordConfirm = passwordConfirm;
            return this;
        }

        public UserModificationRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserModificationRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserModificationRequestBuilder but() {
            return anUserModificationRequest().email(email).password(password).passwordConfirm(passwordConfirm).firstName(firstName).lastName(lastName);
        }

        public UserModificationRequest build() {
            UserModificationRequest userModificationRequest = new UserModificationRequest();
            userModificationRequest.setEmail(email);
            userModificationRequest.setPassword(password);
            userModificationRequest.setPasswordConfirm(passwordConfirm);
            userModificationRequest.setFirstName(firstName);
            userModificationRequest.setLastName(lastName);
            return userModificationRequest;
        }
    }
}
