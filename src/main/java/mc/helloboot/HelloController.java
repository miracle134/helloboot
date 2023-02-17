/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.helloboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName    : mc.helloboot
 * fileName       : HelloController
 * author         : MiracleCat
 * date           : 2023-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-09        MiracleCat       최초 생성
 */
@Controller
public class HelloController {
    private final HelloService helloService;
//    private final ApplicationContext applicationContext;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

//    public HelloController(HelloService helloService, ApplicationContext applicationContext) {
//        this.helloService = helloService;
//        this.applicationContext = applicationContext;
//    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        if (name == null || name.trim().length() == 0) throw new IllegalArgumentException();

        return helloService.sayHello(name);
    }

}
