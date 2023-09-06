package com.artemnizhnyk.hibenate_test;

import com.artemnizhnyk.hibenate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Vlad", "Ivanov", "Sales", 700);
            session.beginTransaction();
            session.saveOrUpdate(emp);
            session.getTransaction().commit();

            System.out.println("Done");
            System.out.println(emp);
        } finally {
            factory.close();
        }
    }
}
