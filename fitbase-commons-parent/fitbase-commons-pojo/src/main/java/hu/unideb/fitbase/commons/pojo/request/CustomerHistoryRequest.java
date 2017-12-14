package hu.unideb.fitbase.commons.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerHistoryRequest implements Serializable {

    private Date startDate;

    private Long gymId;

    private Long passId;

}
