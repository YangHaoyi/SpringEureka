package com.yanghaoyi.user.user.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : YangHaoYi on 2020/5/11.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2020/5/11.
 * Version : V 1.0
 */
@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {

    @RequestMapping(value = "/info",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getUserInfo(){
        return "Response================>UserInfo";
    }
}
