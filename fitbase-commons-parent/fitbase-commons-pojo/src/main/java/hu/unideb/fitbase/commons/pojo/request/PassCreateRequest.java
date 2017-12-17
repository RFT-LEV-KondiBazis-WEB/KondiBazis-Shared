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
public class PassCreateRequest implements Serializable{

    private String name;

    private Integer price;

    private String passType;

    private String duration;

    private String timeDuration;

    private String passTimeDurationType;

    private Boolean available;
}
