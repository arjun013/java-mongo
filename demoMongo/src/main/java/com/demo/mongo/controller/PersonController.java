package com.demo.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mongo.model.Person;
import com.demo.mongo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(method = RequestMethod.POST,value="/create" )
	public List<Person> addPerson(@RequestBody Person person) {
		personService.create(person);
		return personService.getAll();
	}
	@RequestMapping("/get")
	public List<Person> getPersons(){
		return personService.getAll();
	}
	
}
