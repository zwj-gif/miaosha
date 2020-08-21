package com.imooc.miaoshaproject.dataobject;

public class UserDO {

    private Integer id;//用户Id


    private String name;//用户姓名


    private Byte gender;//性别


    private Integer age;//年龄


    private String telphone;//登录手机号


    private String registerMode;//注册来源


    private String thirdPartyId;//第三方账号


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public Byte getGender() {
        return gender;
    }


    public void setGender(Byte gender) {
        this.gender = gender;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public String getTelphone() {
        return telphone;
    }


    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }


    public String getRegisterMode() {
        return registerMode;
    }


    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode == null ? null : registerMode.trim();
    }


    public String getThirdPartyId() {
        return thirdPartyId;
    }


    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId == null ? null : thirdPartyId.trim();
    }
}
