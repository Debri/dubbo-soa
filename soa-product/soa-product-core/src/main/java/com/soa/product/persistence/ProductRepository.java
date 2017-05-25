package com.soa.product.persistence;


import com.soa.product.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Liuqi
 * Date: 2017/5/25.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
