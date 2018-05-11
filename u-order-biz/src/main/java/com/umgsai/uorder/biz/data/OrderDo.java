package com.umgsai.uorder.biz.data;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderDo implements Serializable {

    private long id;

    private String bizId;

    private  String status;

    private String identifier;

    private Date createTime;

    private Date updateTime;
}
