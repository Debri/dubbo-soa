package com.soa.trade.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Liuqi
 * Date: 2017/5/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath*:context.xml")
public class TradeFacadeImplTest {
    @Test
    public void testCreateTrade() throws Exception {
        System.out.println("----------------------");
    }
}