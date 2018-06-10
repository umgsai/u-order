package com.umgsai.uorder.biz.dao;

import com.alibaba.fastjson.JSON;
import com.umgsai.uorder.biz.data.OrderDo;
import com.umgsai.uorder.biz.data.OrderRequestDo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring的测试框架
@ContextConfiguration("/config/*.xml") //加载Spring的配置文件
public class OrderRequestDaoTest {

    @Autowired
    private OrderRequestDao orderRequestDao;

    @Test
    public void testFindById() {
        OrderRequestDo orderRequestDo = orderRequestDao.findById(7);
        System.out.println(JSON.toJSONString(orderRequestDo));
        Assert.assertNotNull(orderRequestDo);
    }

    @Test
    public void testSave() {
        OrderRequestDo orderRequestDo = new OrderRequestDo();
        long id = orderRequestDao.save(orderRequestDo);
        System.out.println(id);
        System.out.println(JSON.toJSONString(orderRequestDo));
    }
}
