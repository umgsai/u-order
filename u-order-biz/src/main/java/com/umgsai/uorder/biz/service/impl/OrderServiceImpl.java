package com.umgsai.uorder.biz.service.impl;

import com.umgsai.uorder.api.dto.request.TestRequest;
import com.umgsai.uorder.api.service.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrderServiceImpl implements OrderService {


    @Transactional(
            propagation=Propagation.REQUIRES_NEW,
            isolation=Isolation.READ_COMMITTED
    )
    public long createOrder(TestRequest testRequest) {
        //开启事物
        //写入request
        //写入order
        //写入step
        return 0;
    }
}
