/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.config.autoconfig;

import mc.config.MyAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * packageName    : mc.config
 * fileName       : DispatcherServeletConfig
 * author         : MiracleCat
 * date           : 2023-02-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-14        MiracleCat       최초 생성
 */
@MyAutoConfiguration
public class DispatcherServletConfig {
    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }
}
