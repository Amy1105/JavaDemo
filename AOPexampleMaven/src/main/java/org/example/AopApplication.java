package org.example;

import org.example.service.UnstableService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UnstableService unstableService) {
        return args -> {
            // 主动调用，测试重试效果
            unstableService.callExternalApi();
        };
    }
}
