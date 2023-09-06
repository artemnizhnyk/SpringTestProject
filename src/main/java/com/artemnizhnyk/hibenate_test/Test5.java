package com.artemnizhnyk.hibenate_test;

import com.artemnizhnyk.hibenate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 7);
//            session.delete(emp);
            session.createQuery("delete Employee where name = 'Taya'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done");

        } finally {
            factory.close();
        }
    }
}
