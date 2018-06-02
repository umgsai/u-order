package com.umgsai.uorder.api.service;

import com.umgsai.uorder.api.dto.request.TestRequest;

public interface OrderService {

    long createOrder(TestRequest testRequest);
}
