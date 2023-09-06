package com.artemnizhnyk.hibernate_many_to_many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "section_id"), inverseJoinColumns = @JoinColumn(name = "child_id"))
    private List<Child> children;

    public Section() {
    }

    public Section(final String name) {
        this.name = name;
    }

    public void addChildToSection(Child child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
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

    public List<Child> getChildren() {
        return children;
    }

    void setChildren(final List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
