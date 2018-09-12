package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController//对外暴露
public class HelloController {
	@Autowired
	private RestTemplate restTemplate;
@RequestMapping("/hello/{name}")
public String hello(@PathVariable String name) {
	//虚拟ip	负载均衡
	String url="http://provider-user/hello/"+name;
	
	return restTemplate.getForObject(url, String.class);
}
}
