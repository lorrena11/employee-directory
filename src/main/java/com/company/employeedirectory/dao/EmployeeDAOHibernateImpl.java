package com.company.employeedirectory.dao;

import com.company.employeedirectory.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    private EntityManager entityManager;

    // set up constructor injection
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);

        // execute query and get result list, return the results
//        List<Employee> employees = query.getResultList();
//        return employees;
        return query.getResultList();
    }

    @Override
    public Employee findById(Long id) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the employee, return the employee
//        Employee employee = currentSession.get(Employee.class, id);
//        return employee;
        return currentSession.get(Employee.class, id);

    }

    @Override
    public void save(Employee employee) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // save employee
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void deleteById(Long id) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // delete object with primary key
        Query query = currentSession.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
