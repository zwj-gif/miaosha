package com.imooc.miaoshaproject.dataobject;

public class ItemDO {

    private Integer id;//id


    private String title;//商品名


    private Double price;//价格


    private String description;//描述


    private Integer sales;//销量


    private String imgUrl;//图片链接


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }


    public Integer getSales() {
        return sales;
    }


    public void setSales(Integer sales) {
        this.sales = sales;
    }


    public String getImgUrl() {
        return imgUrl;
    }


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}
