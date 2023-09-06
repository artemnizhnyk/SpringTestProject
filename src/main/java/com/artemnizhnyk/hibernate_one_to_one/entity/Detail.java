package com.artemnizhnyk.hibernate_one_to_one.entity;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "empDetail", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(final Employee employee) {
        this.employee = employee;
    }

    public Detail() {
    }

    public Detail(final String city, final String phoneNumber, final String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
