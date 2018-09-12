package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient//标识Eureka客户端，通过application配置url
@SpringBootApplication
public class RunAppConsumerClient {
	//注入模板对象,实现负载均衡。
	@Bean
	@LoadBalanced//Ribbon实现负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		
		SpringApplication.run(RunAppConsumerClient.class, args);
	}

}
