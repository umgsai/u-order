package com.umgsai.uorder.biz.data;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderRequestDo implements Serializable {

    private long id;

    private String bizId;

    private String bizData;

    private Date createTime;

    private Date updateTime;
}
