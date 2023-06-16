package util;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.Employee;

public class EmpDuo {

	public void insert(Employee e) {
		Employee emp = new Employee(e.getEmployee_name(), e.getDesignation(), e.getSalary());
		SessionFactory sessionFactory = Hibernate.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		session.save(emp);
		System.out.println("Inserted Successfully");
		session.getTransaction().commit();
	}

//
	public void delete(int id) {
		SessionFactory sessionFactory = Hibernate.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		Employee emp = (Employee) session.load(Employee.class, id);
		session.delete(emp);
		System.out.println("Deleted Successfully");
		session.getTransaction().commit();
	}
//
	public void update(Employee e, int id) {
		SessionFactory sessionFactory = Hibernate.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee emp = (Employee) session.get(Employee.class, id);
		emp.setEmployee_name(e.getEmployee_name());
		emp.setDesignation(e.getDesignation());
		emp.setSalary(e.getSalary());
		System.out.println("Updated Successfully");
		session.getTransaction().commit();
	}

	public ArrayList<Employee> findRecord(int id) {
		ArrayList<Employee> emps = new ArrayList<>();
		SessionFactory sessionFactory = Hibernate.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		Employee emp = (Employee) session.load(Employee.class, id);
		emps.add(new Employee(emp.getEmployee_id(),emp.getEmployee_name(),emp.getDesignation(),emp.getSalary()));
//		session.find(id, emp);
		session.getTransaction().commit();
		return emps;
	}

	public ArrayList<Employee> display() {
		SessionFactory sessionFactory = Hibernate.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		@SuppressWarnings("unchecked")

		ArrayList<Employee> emp = (ArrayList<Employee>) session.createQuery("from Employee").getResultList();
		session.getTransaction().commit();

		return emp;
	}

}
