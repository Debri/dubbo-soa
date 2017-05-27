package com.soa.user.persistence;

import com.soa.user.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

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

    @Test
    public void TestLogin() {
        System.out.println(userRepository.findIdByUserNameAndPassword("liuqi", "123"));
        System.out.println(userRepository.findIdByUserNameAndPassword("刘奇", "123"));
    }

    @Test
    public void TestSave() {

        User user = new User();
       user.setId(12L);
        user.setPassword("123");
        user.setEmail("liuqi@163");
        user.setDeleted(1);
        user.setCreateTime(new Date());
        System.out.println(userRepository.save(user));
    }
}