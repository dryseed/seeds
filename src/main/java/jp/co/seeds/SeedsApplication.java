package jp.co.seeds;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan("jp.co.seeds.mapper")
public class SeedsApplication {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext  = SpringApplication.run(SeedsApplication.class, args);
    }

    public static void displayAllBeans() {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println("beans names=========="+beanName);
        }
    }

}
