package com.soa.web.controller;

import com.soa.order.domain.Order;
import com.soa.order.facade.OrderFacade;
import com.soa.product.domain.Product;
import com.soa.product.facade.ProductFacade;
import com.soa.trade.domain.Trade;
import com.soa.trade.facade.TradeFacade;
import com.soa.user.facade.UserFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by Liuqi
 * Date: 2017/5/28.
 */
@RestController
public class TestController {

    @Resource
    private UserFacade userFacade;

    @Resource
    private ProductFacade productFacade;

    @Resource
    private OrderFacade orderFacade;

    @Resource
    private TradeFacade tradeFacade;

    @RequestMapping(path = "/*", method = RequestMethod.GET)
    public String TestController() {
        System.out.println("test ok");
        return "OK";
    }

    @RequestMapping(path = "test")
    public void index(HttpServletResponse resp) throws IOException, ParseException {

        // 1.测试登录 账号 admin admin
        Long userid = this.login();
        // 2.查看所有产品列表
        List<Product> products = (List<Product>) this.productFacade.findAllProduct();
        // 3.选第一款产品，下订单
        Product product = products.get(0);
        Order order = new Order();
        order.setUserId(userid);
        order.setProductId(product.getId());
        order.setPrice(product.getPrice());
        Long orderId = this.orderFacade.createOrder(order).getId();
        // 4.实现订单交易支付
        Trade trade = new Trade();
        trade.setUserId(order.getUserId());
        trade.setOrderId(orderId);
        trade.setPrice(order.getPrice());
        trade.setPayType(1);// 支付类型:1-支付宝支付，2-网银在线，3-银联，4-微信支付
        trade.setPayStatus(4);// 1 未付款 2 付款中 3 付款失败 4 付款完成
        trade.setGatewayPayNum(String.valueOf((new Date()).getTime()));// 网关支付流水号取当前时间
        trade.setGatewayPayPrice(order.getPrice());
        trade.setGatewayPayTime(new Date());
        this.tradeFacade.createTrade(trade);
        // 5.查看所有的订单信息
        List<Order> orders = (List<Order>) this.orderFacade.findOrderByUserId(userid);
        PrintWriter writer = resp.getWriter();
        for (Order obj : orders) {
            writer.print(obj.toString());
            writer.println();
        }
    }

    private Long login() {
        String userName = "admin";
        String password = "admin";
        Long id = this.userFacade.login(userName, password);
        if (id != null) {
            System.out.println("登录成功 id=" + id);
        } else {
            System.out.println("登录失败");
        }
        return id;
    }
}
