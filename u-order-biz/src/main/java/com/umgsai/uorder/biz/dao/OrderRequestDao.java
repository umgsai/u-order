package com.umgsai.uorder.biz.dao;

import com.umgsai.uorder.biz.data.OrderRequestDo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface OrderRequestDao {

    @ResultMap("com.umgsai.uorder.biz.dao.OrderRequestDao.orderRequestDoMap")
    @Select("select * from u_order_request where id = #{id}")
    OrderRequestDo findById(int id);

    @Options(useGeneratedKeys=true, keyProperty="id")
    @Insert("insert into u_order_request(biz_id, biz_data, create_time, update_time) values(#{bizId}, #{bizData}, now(), now())")
    long save(OrderRequestDo orderRequestDo);
}
