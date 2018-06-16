package com.umgsai.uorder.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public abstract class OrderRquest {

    private int id;

    private String bizId;

    private String bizClass;

    private String bizData;

    private Date createTime;

    private Date updateTime;
}
