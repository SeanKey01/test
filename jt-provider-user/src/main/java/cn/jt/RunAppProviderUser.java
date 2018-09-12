package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//标识Eureka客户端，通过application配置url
@SpringBootApplication
public class RunAppProviderUser {
	public static void main(String[] args) {
		SpringApplication.run(RunAppProviderUser.class, args);
	}

}
