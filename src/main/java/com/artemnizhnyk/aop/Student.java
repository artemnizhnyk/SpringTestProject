package com.artemnizhnyk.aop;

public class Student {
    private String nameSurname;
    private int course;
    private double avgGrade;

    Student(final String nameSurname, final int course, final double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

   public String getNameSurname() {
        return nameSurname;
    }

   public void setNameSurname(final String nameSurname) {
        this.nameSurname = nameSurname;
    }

    int getCourse() {
        return course;
    }

    void setCourse(final int course) {
        this.course = course;
    }

    double getAvgGrade() {
        return avgGrade;
    }

    void setAvgGrade(final double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
