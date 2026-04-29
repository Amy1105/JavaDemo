package org.example.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class UnstableService {

    @org.example.annotation.Retryable  // 使用我们自己造的注解！
    public void callExternalApi() {
        // 模拟一个可能失败的外部API调用
        if (new Random().nextBoolean()) {
            throw new RuntimeException("网络波动，调用失败");
        }
        System.out.println("API 调用成功！");
    }
}