package com.atom;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("inheritance");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		//create one employee
		Employee employee = new Employee();
		employee.setName("kajol");
		employee.setSalary(5000);
		em.persist(employee);
		//create one manager
		Manager manager = new Manager();
		manager.setName("prabhas");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);

		em.getTransaction().commit();
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}

