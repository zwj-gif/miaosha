package com.imooc.miaoshaproject.dataobject;

public class OrderDO {

    private String id;//订单号


    private Integer userId;//下单用户


    private Integer itemId;//下单商品


    private Double itemPrice;//商品原价


    private Integer amount;//商品购买数量


    private Double orderPrice;//订单支付价

    private Integer promoId;//商品参与秒杀活动id

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public Integer getUserId() {
        return userId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Integer getItemId() {
        return itemId;
    }


    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }


    public Double getItemPrice() {
        return itemPrice;
    }


    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }


    public Integer getAmount() {
        return amount;
    }


    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Double getOrderPrice() {
        return orderPrice;
    }


    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }
}
