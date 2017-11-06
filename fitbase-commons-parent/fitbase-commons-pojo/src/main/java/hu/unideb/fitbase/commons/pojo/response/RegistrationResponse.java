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

    //    private String message;
//
//    private List<Violation> errors;
//
//    public RegistrationResponse() {
//    }
//
//    public RegistrationResponse(String message, List<Violation> errors) {
//        this.message = message;
//        this.errors = errors;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public List<Violation> getErrors() {
//        return errors;
//    }
//
//    public void setErrors(List<Violation> errors) {
//        this.errors = errors;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return EqualsBuilder.reflectionEquals(this, obj);
//    }
//
//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this);
//    }
//
//    @Override
//    public int hashCode() {
//        return HashCodeBuilder.reflectionHashCode(this);
//    }
//
}
