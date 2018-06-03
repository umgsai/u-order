package com.umgsai.uorder.api.dto.request;

import com.umgsai.uorder.api.dto.OrderRquest;
import lombok.Data;

@Data
public class TestRequest extends OrderRquest {

    private String username;

    private String password;

}
