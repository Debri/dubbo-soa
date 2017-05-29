package com.debri.common.util;

import org.junit.Test;

import java.util.Date;

/**
 * Created by Liuqi
 * Date: 2017/5/24.
 */
public class DateTimeUtilsTest {
    @Test
    public void TestTime() {
        String str = DateTimeUtils.formatDate(new Date());
        System.out.println(str);
    }
}