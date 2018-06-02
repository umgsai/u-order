package com.umgsai.uorder.biz.engine;

import com.umgsai.uorder.biz.utils.InetAddressUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OrderEngine {

    private static final Logger logger = LogManager.getLogger(OrderEngine.class);

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    public void run(){

        threadPoolTaskExecutor.execute(new Runnable() {
            public void run() {
                logger.info(String.format("Task: %s, Current time: %s，%s", 1, new Date().toLocaleString(), InetAddressUtil.getHostname()));
            }
        });
    }
}
