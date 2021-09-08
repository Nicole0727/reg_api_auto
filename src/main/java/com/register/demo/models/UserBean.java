package com.register.demo.models;

import lombok.Data;

@Data
public class UserBean {
  private Integer id;
  private String name;
  private String email;
  private Integer phone;
  private String pwd;

  public Integer getId(Integer id){
    return this.id;
  }

  public void setId(Integer id){
    this.id=id;
  }
  public String getName(String name){
    return this.name;
  }

  public void setName(String name){
    this.name=name;
  }

  public String getEmail(String email){
    return this.email;
  }

  public void setEmail(String email){
    this.email=email;
  }

  public Integer getPhone(Integer phone){
    return this.phone;
  }

  public void setPhone(Integer phone){
    this.phone=phone;
  }

  public String getPwd(String pwd){
    return this.pwd;
  }

  public void setPwd(String pwd){
    this.pwd=pwd;
  }

}
