package io.pragra.learning.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class SpringfirstApplication {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

		Car car = context.getBean("car", Car.class);
		System.out.println(car);

		Person person = context.getBean(Person.class);
		System.out.println(person);
	}

}
