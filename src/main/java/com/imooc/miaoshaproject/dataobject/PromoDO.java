package com.imooc.miaoshaproject.dataobject;

import java.util.Date;
//秒杀活动数据表
public class PromoDO {


    private Integer id;//秒杀活动id


    private String promoName;//秒杀活动名


    private Date startDate;//开始时间

    private Date endDate;//结束时间


    private Integer itemId;//秒杀商品id


    private Double promoItemPrice;//秒杀商品价格


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getPromoName() {
        return promoName;
    }


    public void setPromoName(String promoName) {
        this.promoName = promoName == null ? null : promoName.trim();
    }


    public Date getStartDate() {
        return startDate;
    }


    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }


    public Integer getItemId() {
        return itemId;
    }


    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }


    public Double getPromoItemPrice() {
        return promoItemPrice;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }



    public void setPromoItemPrice(Double promoItemPrice) {
        this.promoItemPrice = promoItemPrice;
    }
}
