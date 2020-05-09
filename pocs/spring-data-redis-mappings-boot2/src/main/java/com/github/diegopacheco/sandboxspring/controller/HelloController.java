package com.github.diegopacheco.sandboxspring.controller;

import com.github.diegopacheco.sandboxspring.model.Person;
import com.github.diegopacheco.sandboxspring.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	private PersonRepository repo;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/read")
	public String read() {
		return repo.findById("1").toString();
	}

	@RequestMapping("/save")
	public String save() {
		Person p = new Person();
		p.setId("1");
		p.setName("Diego");
		p.setMail("diego.pacheco.it@gmail.com");
		repo.save(p);
		return p.toString();
	}

}

