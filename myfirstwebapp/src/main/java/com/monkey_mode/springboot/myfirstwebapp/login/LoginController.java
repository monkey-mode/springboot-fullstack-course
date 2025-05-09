package com.monkey_mode.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
        // System.out.println("Request param is " + name);
        model.put("name", name);
        return "login";
    }
}
