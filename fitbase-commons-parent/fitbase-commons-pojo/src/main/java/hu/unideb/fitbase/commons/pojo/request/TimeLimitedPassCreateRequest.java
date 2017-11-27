package hu.unideb.fitbase.commons.pojo.request;

import hu.unideb.fitbase.commons.pojo.enumeration.PassType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TimeLimitedPassCreateRequest {

    private String name;

    private Integer price;

    private PassType passType;

    private Integer timeDuration;

    private Boolean available;
}
