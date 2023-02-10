/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * packageName    : mc.helloboot
 * fileName       : HelloServiceTest
 * author         : MiracleCat
 * date           : 2023-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-10        MiracleCat       최초 생성
 */
public class HelloServiceTest {
    @Test
    void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService();

        String ret = helloService.sayHello("Test");
    }
}
