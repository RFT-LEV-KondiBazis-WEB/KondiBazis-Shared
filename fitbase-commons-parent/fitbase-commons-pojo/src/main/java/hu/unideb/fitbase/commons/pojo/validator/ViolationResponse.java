package hu.unideb.fitbase.commons.pojo.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ViolationResponse implements Serializable {

    private List<Violation> violationList;

    public static ViolationResponseBuilder builder() {
        return new ViolationResponseBuilder();
    }

    public static final class ViolationResponseBuilder {
        private ViolationResponse violationResponse;

        private ViolationResponseBuilder() {
            violationResponse = new ViolationResponse();
        }

        public static ViolationResponseBuilder aViolationResponse() {
            return new ViolationResponseBuilder();
        }

        public ViolationResponseBuilder violationList(List<Violation> violationList) {
            violationResponse.setViolationList(violationList);
            return this;
        }

        public ViolationResponse build() {
            return violationResponse;
        }
    }
}
