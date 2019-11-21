package com.yuukiyg.samplejackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yuukiyg.samplejackson.service.MainService;

@SpringBootApplication
public class SampleJacksonApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(
				SampleJacksonApplication.class, args);
		MainService service = context.getBean(MainService.class);
        service.execute();
	}

}
