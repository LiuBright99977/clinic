package cn.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "cn.project.mapper")
@EnableCaching
@EnableOAuth2Sso
public class MedicineApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicineApplication.class,args);
    }
}
