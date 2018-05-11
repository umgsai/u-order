package com.umgsai.uorder.biz.dao;

import com.umgsai.uorder.biz.data.OrderDo;

public interface OrderDao {

    OrderDo findById(int id);
}
