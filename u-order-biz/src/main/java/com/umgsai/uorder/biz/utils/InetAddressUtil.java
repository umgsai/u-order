package com.umgsai.uorder.biz.utils;

import com.umgsai.uorder.biz.engine.OrderEngine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.InetAddress;

public class InetAddressUtil {

    private static final Logger logger = LogManager.getLogger(OrderEngine.class);

    private static String hostname;

    static {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            hostname = inetAddress.getHostName();
        } catch (Exception e) {
            logger.info("获取主机名失败！", e);
            System.exit(1);
        }
    }

    public static String getHostname() {
        return hostname;
    }
}
