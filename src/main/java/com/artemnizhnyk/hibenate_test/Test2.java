package com.artemnizhnyk.hibenate_test;

import com.artemnizhnyk.hibenate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Adella", "Zaremba", "Sales", 750);
            session.beginTransaction();
            session.saveOrUpdate(emp);
//            session.getTransaction().commit();
//
            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);
            System.out.println("Done");

        } finally {
            factory.close();
        }
    }
}
