package com.soa.product.persistence;

import com.soa.product.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Liuqi
 * Date: 2017/5/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath*:context.xml")
public class ProductRepositoryTest {
    @Resource
    ProductRepository productRepository;

    @Test
    public void TestProductCRUD() {

        Product product = new Product();
        product.setId(3L);
        product.setStatus(1);
        product.setName("product111");
        product.setPrice(123);
        product.setCreateTime(new Date());
        System.out.println(productRepository.save(product));
    }

}