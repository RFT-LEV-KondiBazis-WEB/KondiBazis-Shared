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
public class UserModificationRequest implements Serializable {

    private String email;

    private String password;

    private String passwordConfirm;

    private String firstName;

    private String lastName;
}
