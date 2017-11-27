package hu.unideb.fitbase.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PassCreateRequest {
    private SuitablePassCreateRequest suitablePassCreateRequest;
    private TimeLimitedPassCreateRequest timeLimitedPassCreateRequest;
}
