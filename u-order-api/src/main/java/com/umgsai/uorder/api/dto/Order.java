package com.umgsai.uorder.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Order implements Serializable {

    private long id;

    private String bizId;

    private  String status;

    private String identifier;

    private Date createTime;

    private Date updateTime;
}
