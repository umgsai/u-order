package com.umgsai.uorder.biz.stepWorker;

import com.umgsai.uorder.api.dto.Order;
import com.umgsai.uorder.api.dto.StepResult;
import org.springframework.stereotype.Component;

@Component
public class TestStepWorker implements StepWorker {

    public StepResult doBusiness(Order order) {
        return null;
    }
}
