package com.soa.trade.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by Liuqi
 * Date: 2017/5/27.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(value = "classpath*:context.xml")
public class TradeRepositoryTest {
    @Resource
    TradeRepository tradeRepository;

    @Test
    public void testFind() {
        System.out.println(tradeRepository.findAll());
    }
}