package com.windseeker2011.cloud.sleuth.mircoservice.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * 第一个微服务
 * 
 * @author Weihai Li
 *
 */
@RestController
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class ServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * 一层调用
	 * 
	 * @return
	 */
	@GetMapping(value = "/1")
	public String m1() {
		log.info("我是微服务1号。。。");
		return "success";
	}

	/**
	 * 二层调用
	 * 
	 * @return
	 */
	@GetMapping(value = "/2")
	public String m2() {
		log.info("我是微服务1号。。。");
		ResponseEntity<String> result = restTemplate().getForEntity("http://MICROSERVICE-B/1", String.class);
		return result.getBody();
	}

	/**
	 * 三层调用
	 * 
	 * @return
	 */
	@GetMapping(value = "/3")
	public String m3() {
		log.info("我是微服务1号。。。");
		ResponseEntity<String> result = restTemplate().getForEntity("http://MICROSERVICE-B/2", String.class);
		return result.getBody();
	}

	public static void main(String[] args) throws Exception {
		String[] args2 = new String[] { "--spring.profiles.active=a" };
		SpringApplication.run(ServiceApplication.class, args2);

	}

}
