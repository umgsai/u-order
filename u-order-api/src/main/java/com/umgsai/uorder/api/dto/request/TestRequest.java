package com.umgsai.uorder.api.dto.request;

import com.umgsai.uorder.api.dto.OrderRequest;
import lombok.Data;

@Data
public class TestRequest extends OrderRequest {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
