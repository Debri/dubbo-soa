package com.soa.user.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Liuqi
 * Date: 2017/5/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath*:context.xml")
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testFindIdByUserNameAndPassword() throws Exception {
        System.out.println(userRepository.findOne(2L));

    }

}