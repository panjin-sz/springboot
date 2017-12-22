package com.panjin.controller;

import com.panjin.domain.User;
import com.panjin.service.UserService;
import com.panjin.utils.IpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 健康检查
 * @author panjin.
 * @date 2017/12/21.
 */
@RestController
public class HealthController {

    @Autowired
    private UserService userService;

    /**
     * 健康检查
     * @param name
     * @return
     */
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health(@RequestParam String name, HttpServletRequest request) {
        String ipAddr = IpUtil.getIpAddr(request);
        String hostIp = IpUtil.getLocalHostIp();
        String hostName = IpUtil.getLocalHostName();
        return "hello, "+ name + ", come from "+ ipAddr + ", localhost ip " + hostIp + ", host name " + hostName;
    }

    /**
     * 获取用户信息
     * @return
     */
    @RequestMapping(value = "/getUser")
    public String getUser() {
        User user = userService.getUser();
        return user.toString();
    }
}
