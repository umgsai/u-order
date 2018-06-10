package com.umgsai.uorder.biz.dao;

import com.umgsai.uorder.biz.data.OrderDo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface OrderDao {

    @ResultMap("com.umgsai.uorder.biz.dao.OrderDao.orderDoMap")
    @Select("select * from u_order where id = #{id}")
    OrderDo findById(int id);
}
