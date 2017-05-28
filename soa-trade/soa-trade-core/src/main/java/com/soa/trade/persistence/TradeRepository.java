package com.soa.trade.persistence;


import com.soa.trade.domain.Trade;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Liuqi
 * Date: 2017/5/26.
 */
public interface TradeRepository extends CrudRepository<Trade, Long> {
}
