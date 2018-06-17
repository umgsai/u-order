package com.umgsai.uorder.api.dto;

import lombok.Data;

import java.util.Date;

//@Data
public abstract class OrderRequest {

    private int id;

    private String bizId;

    private String bizClass;

    private String bizData;

    private Date createTime;

    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getBizClass() {
        return bizClass;
    }

    public void setBizClass(String bizClass) {
        this.bizClass = bizClass;
    }

    public String getBizData() {
        return bizData;
    }

    public void setBizData(String bizData) {
        this.bizData = bizData;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
