package com.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.entity.Person;
import com.ssh.repository.PersonRepository;
import com.ssh.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public Long savePerson() {
		Person person = new Person();
		person.setUsername("XRog");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is XRog");
		return personRepository.save(person);
	}

}
