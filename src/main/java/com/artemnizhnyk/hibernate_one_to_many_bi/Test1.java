package com.artemnizhnyk.hibernate_one_to_many_bi;



import com.artemnizhnyk.hibernate_one_to_many_bi.entity.Department;
import com.artemnizhnyk.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("IT", 1200, 300);
//            Employee emp1 = new Employee("Artem", "Nizhnyk", 800);
//            Employee emp2 = new Employee("Daniel", "Matwijewski", 1000);
//            Employee emp3 = new Employee("Eugene", "Hachaturow", 1200);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.saveOrUpdate(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done");


//*********************************************************


            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Get Department");
            Department department = session.get(Department.class, 3);
            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees of the department ");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done");

//*********************************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done");

//*********************************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 3);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }
    }
}
