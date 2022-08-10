package com.store.hs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HsApplication {
	private static final Logger logger = LoggerFactory.getLogger(HsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(HsApplication.class, args);
		logger.info("hola logger");
	}
}
