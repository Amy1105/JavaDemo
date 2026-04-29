package org.example.aspect;
//package org.example.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RetryAspect {
    // 1. 定义剧本场景：哪些方法需要被安排“重试”这场戏？
    @Pointcut("@annotation(com.example.annotation.Retryable)")
    public void retryPointcut() {}

    // 2. 安排剧情：在目标方法执行时，用“环绕通知”来插入重试逻辑
    @Around("retryPointcut()")
    public Object doRetry(ProceedingJoinPoint joinPoint) throws Throwable {
        int maxAttempts = 3;
        int attempt = 1;
        Exception lastException = null;

        while (attempt <= maxAttempts) {
            try {
                System.out.println(String.format("执行第 %d 次尝试", attempt));
                // 执行真正的业务方法，执行目标方法并返回结果
                return joinPoint.proceed();
            } catch (Exception e) {
                lastException = e;
                System.out.println(String.format("第 %d 次执行失败，异常：%s", attempt, e.getMessage()));
                if (attempt == maxAttempts) {
                    break; // 最后一次失败，跳出循环
                }
                attempt++;
            }
        }
        throw new RuntimeException(String.format("重试 %d 次后仍然失败", maxAttempts), lastException);
    }
}
