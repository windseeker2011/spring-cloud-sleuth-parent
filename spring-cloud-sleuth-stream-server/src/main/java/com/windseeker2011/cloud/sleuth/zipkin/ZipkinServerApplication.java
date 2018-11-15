package com.windseeker2011.cloud.sleuth.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Zipkin Stream Server
 * 
 * @author Weihai Li
 *
 */
@EnableEurekaClient
@EnableZipkinStreamServer
@SpringBootApplication
public class ZipkinServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZipkinServerApplication.class, args);

	}

}
