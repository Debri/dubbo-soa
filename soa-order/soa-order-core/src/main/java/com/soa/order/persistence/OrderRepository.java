package com.soa.order.persistence;


import com.soa.order.domain.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Liuqi
 * Date: 2017/5/23.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
    @Query(value = "update order set trade_id = ?1 ,trade_status=1 where id =?2 ", nativeQuery = true)
    public void updateOrderByTrade(Long tradeId, Long id);

    @Query(value = "select  * form order o where user_id=?1", nativeQuery = true)
    public Iterable<Order> findByUserId(Long userId);

    @Query(value = "select * from order", nativeQuery = true)
    public Iterable<Order> find();

}
