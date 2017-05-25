package com.soa.product.facade;


import com.soa.product.domain.Product;
import com.soa.product.persistence.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Liuqi
 * Date: 2017/5/23.
 */
@Service
public class ProductFacadeImpl implements ProductFacade {
    @Resource
    private ProductRepository productRepository;

    public Iterable<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Product findProductById(Long id) {
        return productRepository.findOne(id);
    }
}
