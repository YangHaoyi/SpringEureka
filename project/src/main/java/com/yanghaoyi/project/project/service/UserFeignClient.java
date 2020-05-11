package com.yanghaoyi.project.project.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("USER")
@Component
public interface UserFeignClient {
    @RequestMapping("api/v1/user/info")
    String getUserInfo();
}
