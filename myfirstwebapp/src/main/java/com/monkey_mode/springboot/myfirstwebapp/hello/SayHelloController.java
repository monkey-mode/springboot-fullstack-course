package com.monkey_mode.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @GetMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<body>");
        sb.append("<h1>Hello World</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @GetMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
