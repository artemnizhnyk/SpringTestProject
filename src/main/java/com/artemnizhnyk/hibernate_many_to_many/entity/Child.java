package com.artemnizhnyk.hibernate_many_to_many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String firstName;
    @Column(name = "age")
    private int age;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "child_id"), inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    public Child() {
    }

    public Child(final String firstName, final int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void addSectionToChild(final Section section) {
        if (sections == null) {
            sections = new ArrayList<>();
        }
        sections.add(section);
    }

    int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    int getAge() {
        return age;
    }

    void setAge(final int age) {
        this.age = age;
    }

    public List<Section> getSections() {
        return sections;
    }

    void setSections(final List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
