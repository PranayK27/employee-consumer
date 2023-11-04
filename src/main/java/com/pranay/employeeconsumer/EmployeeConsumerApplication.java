package com.pranay.employeeconsumer;

import com.pranay.employeeconsumer.controllers.ConsumerControllerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class EmployeeConsumerApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = SpringApplication.run(
				EmployeeConsumerApplication.class, args);

		ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();

	}

	@Bean
	public  ConsumerControllerClient  consumerControllerClient()
	{
		return  new ConsumerControllerClient();
	}
}
