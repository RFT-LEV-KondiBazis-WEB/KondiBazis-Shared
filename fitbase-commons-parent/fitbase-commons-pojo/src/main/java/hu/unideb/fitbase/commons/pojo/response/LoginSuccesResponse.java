package hu.unideb.fitbase.commons.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginSuccesResponse {
    private Object data;
    private MetaResponse meta;
}
