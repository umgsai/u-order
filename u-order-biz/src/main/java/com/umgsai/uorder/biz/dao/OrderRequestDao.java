package com.umgsai.uorder.biz.dao;

import com.umgsai.uorder.biz.data.OrderRequestDo;

public interface OrderRequestDao {

    OrderRequestDo findById(int id);
}
