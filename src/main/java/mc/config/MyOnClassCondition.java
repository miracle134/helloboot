/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

import java.util.Map;

/**
 * packageName    : mc.config
 * fileName       : MyOnClassCondition
 * author         : MiracleCat
 * date           : 2023-02-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-16        MiracleCat       최초 생성
 */
public class MyOnClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalMyOnClass.class.getName());
        String value = (String) attributes.get("value");
        return ClassUtils.isPresent(value, context.getClassLoader());
    }
}
