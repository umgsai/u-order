package com.umgsai.uorder.biz.dao;

import com.alibaba.fastjson.JSON;
import com.umgsai.uorder.biz.data.OrderDo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring的测试框架
@ContextConfiguration("/config/*.xml") //加载Spring的配置文件
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    @Test
    public void testFindById() {
        OrderDo orderDo = orderDao.findById(1);
        System.out.println(JSON.toJSONString(orderDo));
        Assert.assertNotNull(orderDo);
    }
}
