package com.artemnizhnyk.hibernate_many_to_many;

import com.artemnizhnyk.hibernate_many_to_many.entity.Child;
import com.artemnizhnyk.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class).buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Valik", 5);
//            Child child2 = new Child("Vlad", 6);
//            Child child3 = new Child("Taya", 4);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
            //************************************************************


//
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Gleb", 5);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.saveOrUpdate(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done");
            //************************************************************






//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done");
            //************************************************************





            session = factory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class, 7);
            session.delete(section);

            session.getTransaction().commit();
            System.out.println("Done");


        }finally {
            session.close();
            factory.close();
        }
    }
}
