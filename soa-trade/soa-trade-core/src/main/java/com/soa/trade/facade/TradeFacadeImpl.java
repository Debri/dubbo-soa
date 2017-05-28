package com.soa.trade.facade;


import com.soa.order.domain.Order;
import com.soa.order.facade.OrderFacade;
import com.soa.trade.domain.Trade;
import com.soa.trade.persistence.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Liuqi
 * Date: 2017/5/26.
 */
@Service
public class TradeFacadeImpl implements TradeFacade {
    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    @Qualifier(value = "orderFacade")
    private OrderFacade orderFacade;

    public void createTrade(Trade trade) {
        tradeRepository.save(trade);
        Order order = new Order();
        order.setId(trade.getOrderId());
        order.setTradeId(order.getId());
        orderFacade.updateOrderByTrade(order);
    }
}
