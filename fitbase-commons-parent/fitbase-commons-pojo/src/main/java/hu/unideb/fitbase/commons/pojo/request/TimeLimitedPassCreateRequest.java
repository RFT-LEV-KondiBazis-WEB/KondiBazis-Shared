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
public class TimeLimitedPassCreateRequest implements Serializable {

    private String name;

    private Integer price;

    private Integer timeDuration;

    private String passTimeDurationType;

    private Boolean available;
}
