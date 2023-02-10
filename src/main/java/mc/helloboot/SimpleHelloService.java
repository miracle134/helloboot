/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.helloboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * packageName    : mc.helloboot
 * fileName       : SimpleHelloService
 * author         : MiracleCat
 * date           : 2023-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-10        MiracleCat       최초 생성
 */
@Service
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }
}
