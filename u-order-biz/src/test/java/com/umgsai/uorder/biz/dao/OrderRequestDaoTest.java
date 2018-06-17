package com.umgsai.uorder.biz.dao;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.regexp.internal.RE;
import com.umgsai.uorder.api.dto.request.TestRequest;
import com.umgsai.uorder.biz.data.OrderDo;
import com.umgsai.uorder.biz.data.OrderRequestDo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring的测试框架
@ContextConfiguration("/config/*.xml") //加载Spring的配置文件
public class OrderRequestDaoTest {

    @Autowired
    private OrderRequestDao orderRequestDao;

    @Test
    public void testFindById() {
        OrderRequestDo orderRequestDo = orderRequestDao.findById(10);
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

    @Test
    public void testSave1() {
        TestRequest request = new TestRequest();
        request.setBizId(UUID.randomUUID().toString());
        request.setPassword("123456");
        request.setUsername("admin");
        request.setBizClass(TestRequest.class.getName());
        System.out.println(JSON.toJSONString(request));

        OrderRequestDo orderRequestDo = new OrderRequestDo();
        BeanUtils.copyProperties(request, orderRequestDo);
        orderRequestDo.setBizData(JSON.toJSONString(request));
        System.out.println(JSON.toJSONString(orderRequestDo));

        long id = orderRequestDao.save(orderRequestDo);
        System.out.println(id);
    }
}
