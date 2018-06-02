package com.umgsai.uorder.biz.stepWorker;

import com.umgsai.uorder.api.dto.Order;
import com.umgsai.uorder.api.dto.StepResult;

public interface StepWorker {

    StepResult doBusiness(Order order);
}
