package org.launchcode.codingevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.launchcode.codingevents"})
public class CodingEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingEventsApplication.class, args);
	}

}
