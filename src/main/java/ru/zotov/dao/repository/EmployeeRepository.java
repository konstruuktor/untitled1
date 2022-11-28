package ru.zotov.dao.repository;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import ru.zotov.dao.model.Employee;
import ru.zotov.dao.util.HibernateUtil;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
public class EmployeeRepository implements Repository<Employee, Long> {
    @Override
    public Employee findById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee employee = session.get(Employee.class, id);
        Hibernate.initialize(employee);
        session.close();
        return employee;
    }

    @Override
    public void save(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.saveOrUpdate(employee);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(employee);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(employee);
        tx1.commit();
        session.close();
    }
}
