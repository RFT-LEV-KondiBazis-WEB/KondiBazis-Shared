package hu.unideb.fitbase.commons.pojo.request;

import hu.unideb.fitbase.commons.pojo.enumeration.PassType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SuitablePassCreateRequest implements Serializable{

    private String name;

    private Integer price;

    private PassType passType;

    private Integer duration;

    private Boolean available;
}
