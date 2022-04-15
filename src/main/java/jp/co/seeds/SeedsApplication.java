package jp.co.seeds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.co.seeds.mapper")
public class SeedsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeedsApplication.class, args);
    }


}
