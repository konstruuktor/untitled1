package ru.zotov.dao.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GenericGenerator(name = "keygen", strategy = "increment")
    @GeneratedValue(generator = "keygen")
    @Column(name = "employee_id")
    int employeeId;
    @Column(name = "name")
    String name;
    @Column(name = "age")
    int age;
    @Column(name = "sex")
    String sex;
    @ManyToOne
    Position position;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
