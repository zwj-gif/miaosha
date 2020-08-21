package com.imooc.miaoshaproject.dataobject;

public class ItemStockDO {

    private Integer id;//id


    private Integer stock;//库存数量


    private Integer itemId;//商品id


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getStock() {
        return stock;
    }


    public void setStock(Integer stock) {
        this.stock = stock;
    }


    public Integer getItemId() {
        return itemId;
    }


    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
