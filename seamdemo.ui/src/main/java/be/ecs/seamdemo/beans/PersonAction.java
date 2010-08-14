package be.ecs.seamdemo.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.datamodel.DataModel;

import be.ecs.seamdemo.entities.Person;

@Name("personAction")
public class PersonAction {

	@DataModel
	private List<Person> persons;
	
	@In
	EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Factory("persons")
	public void fetchPersons() {
		Query query = getEntityManager().createQuery("select p from Person p");
		this.persons = query.getResultList();
	}
}
