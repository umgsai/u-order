package com.umgsai.uorder.biz.engine;

import com.umgsai.uorder.biz.stepWorker.StepWorker;
import lombok.Data;

import java.util.Map;

@Data
public class OrderRunner {

    private String orderType;

    private Map<String, StepWorker> stepWorkers;
}
