package com.soa.product.facade;


import com.soa.product.domain.Product;

/**
 * Created by Liuqi
 * Date: 2017/5/15.
 */
public interface ProductFacade {
    public Iterable<Product> findAllProduct();

    public Product findProductById(Long id);
}
