/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.helloboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * packageName    : mc.helloboot
 * fileName       : HelloDecorator
 * author         : MiracleCat
 * date           : 2023-02-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-13        MiracleCat       최초 생성
 */
@Service
@Primary
public class HelloDecorator implements HelloService{
    private final HelloService helloService;

    public HelloDecorator(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String sayHello(String name) {
        return "*" + helloService.sayHello(name) + "*";
    }
}
