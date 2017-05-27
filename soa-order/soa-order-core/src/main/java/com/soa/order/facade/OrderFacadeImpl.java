package com.soa.order.facade;


import com.soa.order.domain.Order;
import com.soa.order.persistence.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Liuqi
 * Date: 2017/5/23.
 */
@Service
public class OrderFacadeImpl implements OrderFacade {
    @Resource
    private OrderRepository orderRepository;

    public Iterable<Order> findOrderByUserId(Long userId) {

        return orderRepository.findByUserId(userId);

    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public void updateOrderByTrade(Order order) {
        orderRepository.updateOrderByTrade(order.getTradeId(), order.getId());
        return;
    }
}
