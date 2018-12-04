package com.windseeker2011.cloud.sleuth.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

/**
 * Zipkin Stream Server
 * 
 * @author Weihai Li
 *
 */
@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZipkinServerApplication.class, args);

	}

}
