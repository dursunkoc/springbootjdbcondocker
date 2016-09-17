package com.turkcell.softlab.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.softlab.db.model.Person;
import com.turkcell.softlab.db.repository.PersonJpaRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonJpaRepository personRepository;

	@RequestMapping("/")
	public void index(HttpServletResponse response) throws IOException {
		response.sendRedirect("/people");
	}

	@RequestMapping(method = GET, path = "/people")
	public List<Person> people() {
		return personRepository.findAll();
	}

	@RequestMapping(method = GET, path = "/people/names")
	public List<String> peoplenames() {
		return personRepository.findAll().stream()
				.map(p -> p.getFirst() + " " + p.getLast())
				.collect(Collectors.toList());
	}

	@RequestMapping(method = POST, path = "/people")
	public Person create(@RequestBody Person p) {
		return personRepository.save(p);
	}

	@RequestMapping(method = GET, path = "/people/{id}")
	public Person find(@PathVariable final Long id) {
		return personRepository.findOne(id);
	}

}