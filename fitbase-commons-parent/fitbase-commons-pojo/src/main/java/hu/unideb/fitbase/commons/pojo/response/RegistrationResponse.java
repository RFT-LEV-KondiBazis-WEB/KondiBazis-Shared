package hu.unideb.fitbase.commons.pojo.response;

import java.io.Serializable;

public class RegistrationResponse implements Serializable {

    private Error errors;

    public Error getErrors() {
        return errors;
    }

    public void setErrors(Error errors) {
        this.errors = errors;
    }
}
