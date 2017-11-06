package hu.unideb.fitbase.commons.pojo.exceptions;

import hu.unideb.fitbase.commons.pojo.validator.Violation;
import java.util.List;

/**
 * Violation exception which is thrown when a Validator gives back error on validating input.
 *
 */
public class ViolationException extends BaseException {

    private List<Violation> errors;


    public ViolationException(List<Violation> violationList) {
        this.errors = violationList;
    }

    public List<Violation> getViolationList() {
        return this.errors;
    }

    public String toString() {
        return "ViolationException{errors=" + this.errors + '}';
    }
}
