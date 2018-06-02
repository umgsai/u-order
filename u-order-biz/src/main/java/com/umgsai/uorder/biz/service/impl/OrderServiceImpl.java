package com.umgsai.uorder.biz.service.impl;

import com.umgsai.uorder.api.dto.request.TestRequest;
import com.umgsai.uorder.api.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    public long createOrder(TestRequest testRequest) {
        //开启事物
        //写入request
        //写入order
        //写入step
        return 0;
    }
}
