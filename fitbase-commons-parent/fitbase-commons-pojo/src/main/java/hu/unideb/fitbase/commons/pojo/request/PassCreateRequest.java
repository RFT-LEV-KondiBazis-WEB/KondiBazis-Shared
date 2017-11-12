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

    private Boolean isLimited;

    private Integer limitNumber;

    private Integer duration;

    private Integer price;

    private Boolean available;
}
