package com.umgsai.uorder.biz.core;

public class OrderCreator {

    long createOrder(){
        return 0;
    }

    private String getOrderType () {
        return "TEST-TYPE";
    }

    private String[] getSteps () {
        String steps[] = {
                "STEP-1",
                "STEP-2",
                "STEP-3"
        };
        return steps;
    }
}
