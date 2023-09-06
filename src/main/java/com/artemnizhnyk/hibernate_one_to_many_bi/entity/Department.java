package com.artemnizhnyk.hibernate_one_to_many_bi.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> emps;

    public Department() {
    }

    public Department(final String departmentName, final int maxSalary, final int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(final Employee employee) {
        if (emps == null) {
            emps = new ArrayList<>();
        }
        emps.add(employee);
        employee.setDepartment(this);
    }

    int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    String getDepartmentName() {
        return departmentName;
    }

    void setDepartmentName(final String departmentName) {
        this.departmentName = departmentName;
    }

    int getMaxSalary() {
        return maxSalary;
    }

    void setMaxSalary(final int maxSalary) {
        this.maxSalary = maxSalary;
    }

    int getMinSalary() {
        return minSalary;
    }

    void setMinSalary(final int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    void setEmps(final List<Employee> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }
}
