package com.ssh.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.entity.Person;
import com.ssh.repository.PersonRepository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return this.sessionFactory.openSession();
	}

	public Person load(Long id) {
		// TODO Auto-generated method stub
		return (Person) getCurrentSession().load(Person.class, id);
	}

	public Person get(Long id) {
		// TODO Auto-generated method stub
		return (Person) getCurrentSession().get(Person.class, id);
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(Person entity) {
		// TODO Auto-generated method stub
		getCurrentSession().persist(entity);
	}

	public Long save(Person entity) {
		// TODO Auto-generated method stub
		return (Long) getCurrentSession().save(entity);
	}

	public void saveOrUpdate(Person entity) {
		// TODO Auto-generated method stub
		getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		Person person = load(id);
		getCurrentSession().delete(person);
	}

	public void flush() {
		// TODO Auto-generated method stub
		getCurrentSession().flush();
	}

}
