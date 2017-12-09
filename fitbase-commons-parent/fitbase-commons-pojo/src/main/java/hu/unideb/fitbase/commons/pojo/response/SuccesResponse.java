package hu.unideb.fitbase.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuccesResponse {
    private Object data;
    private MetaResponse meta;
}
