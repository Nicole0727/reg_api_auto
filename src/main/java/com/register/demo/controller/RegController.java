package com.register.demo.controller;

import com.register.demo.models.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.register.demo.repositories.UserRepository;


@Controller
public class RegController {

  @Autowired
  private UserRepository userRepository;

  //注册接口
  @PostMapping(path = "/register")
  public @ResponseBody String reg(@RequestBody Integer id,
      @RequestBody String name,
      @RequestBody String email,
      @RequestBody Integer phone,
      @RequestBody String pwd){

    //实例化UserBean类，调用成员变量
    UserBean n = new UserBean();
    n.setId(id);
    n.setName(name);
    n.setEmail(email);
    n.setPhone(phone);
    n.setPwd(pwd);

    userRepository.save(n);

    return "Successfully";
  }
}

