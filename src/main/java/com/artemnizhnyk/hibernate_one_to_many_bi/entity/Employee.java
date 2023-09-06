package com.artemnizhnyk.hibernate_one_to_many_bi.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "salary")
    private int salary;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {
    }

    public Employee(final String name, final String surname, final int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(final String surname) {
        this.surname = surname;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(final int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    void setDepartment(final Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
