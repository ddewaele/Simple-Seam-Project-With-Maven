package be.ecs.seamdemo.beans;

import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import be.ecs.seamdemo.entities.Person;

@Name("personHome")
public class PersonHome extends EntityHome<Person> {

	private static final long serialVersionUID = 1729733881106540912L;

	@In
	EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
