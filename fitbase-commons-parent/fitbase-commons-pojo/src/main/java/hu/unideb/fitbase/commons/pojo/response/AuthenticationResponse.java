package hu.unideb.fitbase.commons.pojo.response;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
    private String token;
    private Data data;


    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token, Data data) {
        this.token = token;
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
