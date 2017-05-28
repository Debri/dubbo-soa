package com.soa.trade.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Liuqi
 * Date: 2017/5/27.
 */
@Table(name = "trade")
@Entity(name = "trade")
public class Trade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_id", nullable = false)
    private Long orderId;//订单ID

    @Column(name = "user_id")
    private Long userId;//用户ID

    private Integer price;//支付价
    @Column(name = "pay_status")
    private Integer payStatus;//1 未付款 2 付款中 3 付款失败 4 付款完成
    @Column(name = "pay_type")
    private Integer payType;//支付类型:1-支付宝支付，2-网银在线，3-银联，4-微信支付
    @Column(name = "gateway_pay_num")
    private String gatewayPayNum;//网关支付流水号
    @Column(name = "gateway_pay_time")
    private Date gatewayPayTime;//网关支付时间
    @Column(name = "gateway_pay_price")
    private Integer gatewayPayPrice;//网关实际支付金额

    private Integer deleted;//删除标志，默认0不删除，1删除

    @Column(name = "create_time")
    @CreatedDate
    private Date createTime;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", userId=" + userId +
                ", price=" + price +
                ", payStatus=" + payStatus +
                ", payType=" + payType +
                ", gatewayPayNum='" + gatewayPayNum + '\'' +
                ", gatewayPayTime=" + gatewayPayTime +
                ", gatewayPayPrice=" + gatewayPayPrice +
                ", deleted=" + deleted +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getGatewayPayNum() {
        return gatewayPayNum;
    }

    public void setGatewayPayNum(String gatewayPayNum) {
        this.gatewayPayNum = gatewayPayNum;
    }

    public Date getGatewayPayTime() {
        return gatewayPayTime;
    }

    public void setGatewayPayTime(Date gatewayPayTime) {
        this.gatewayPayTime = gatewayPayTime;
    }

    public Integer getGatewayPayPrice() {
        return gatewayPayPrice;
    }

    public void setGatewayPayPrice(Integer gatewayPayPrice) {
        this.gatewayPayPrice = gatewayPayPrice;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
