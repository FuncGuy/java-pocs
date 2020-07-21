package com.github.diegopacheco.sadbox.java.jpasimple;

import com.github.diegopacheco.sadbox.java.jpasimple.dao.ContactRepository;
import com.github.diegopacheco.sadbox.java.jpasimple.model.Contact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(ContactRepository repository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11)
					.mapToObj(i -> {
						Contact c = new Contact();
						c.setName("Contact " + i);
						c.setEmail("contact" + i + "@email.com");
						c.setPhone("(111) 111-1111");
						return c;
					})
					.map(v -> repository.save(v))
					.forEach(System.out::println);

			Long someRandonId = repository.findAll().get(0).getId();

			Contact c = repository.findById(someRandonId).get();
			c.setPhone("55 51 8888 3333");
			repository.save(c);

		};
	}

}
