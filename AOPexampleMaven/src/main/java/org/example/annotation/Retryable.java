package org.example.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)      // 目标：方法上
@Retention(RetentionPolicy.RUNTIME) // 运行时保留
public @interface Retryable {
}
