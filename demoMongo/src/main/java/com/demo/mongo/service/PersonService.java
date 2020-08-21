package com.demo.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mongo.model.Person;
import com.demo.mongo.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public Person create(Person person) {
		return personRepository.save(new Person(person.getFirstName(),person.getLastName(),person.getAge()));
	}
	
	public List<Person> getAll(){
		return personRepository.findAll();
	}
	
}
