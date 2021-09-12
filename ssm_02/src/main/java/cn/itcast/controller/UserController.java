package cn.itcast.controller;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("users")
    public String toUsers(Model model) {
        System.out.println("请求进来了");
        List<User> users = userService.queryUserList();
        model.addAttribute("users", users);
        return "users";
    }

}
