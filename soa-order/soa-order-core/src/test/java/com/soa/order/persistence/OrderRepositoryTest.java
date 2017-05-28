package com.soa.order.persistence;

import com.soa.order.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;


/**
 * Created by Liuqi
 * Date: 2017/5/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath*:context.xml")
public class OrderRepositoryTest {
    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testUpdateOrderByTrade() throws Exception {

    }

    @Test
    public void testFindByUserId() throws Exception {

    }

    @Test
    public void testFind() throws Exception {
        System.out.println(orderRepository.find());
    }

    @Test
    public void testSave() {
        Order order = new Order();
        order.setId(6L);
        order.setProductId(1L);
        order.setId(1L);
        order.setDeleted(1);
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());
        System.out.println(orderRepository.save(order));
    }

}