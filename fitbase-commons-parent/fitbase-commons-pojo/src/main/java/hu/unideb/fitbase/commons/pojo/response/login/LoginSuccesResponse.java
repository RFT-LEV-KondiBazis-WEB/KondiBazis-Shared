package hu.unideb.fitbase.commons.pojo.response.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginSuccesResponse {

    private hu.unideb.fitbase.commons.pojo.response.Data data;

    private Meta meta;
}
