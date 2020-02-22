package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.Employee;


@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	@Transactional
	public List<Employee> findAll() {
		
		//get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		//execute query
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}

}
