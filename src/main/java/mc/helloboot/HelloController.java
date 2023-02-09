/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return String.format("Hello %s",name);
    }

}
