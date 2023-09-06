package com.artemnizhnyk.hibernate_one_to_one;


import com.artemnizhnyk.hibernate_one_to_one.entity.Detail;
import com.artemnizhnyk.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Artem", "Nizhnyk", "IT", 1500);
//            Detail detail = new Detail("Gdansk", "123456789", "artemnizhnyk@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.saveOrUpdate(employee);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Daniel", "Matwijewski", "IT", 1200);
//            Detail detail = new Detail("Gdansk", "987654321", "daniel@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.saveOrUpdate(employee);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done");



        } finally {
            session.close();
            factory.close();
        }
    }
}
