package com.websystique.springboot.SpringBootCRUDApplicationExample.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="APP_USER")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name="NAME", nullable=false)
    private String name;

    @Column(name="AGE", nullable=false)
    private Integer age;

    @Column(name="SALARY", nullable=false)
    private double salary;

    @Column(name = "STATUS", nullable = false)
    private double status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

//       @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User user = (User) o;
//
//        if (Double.compare(user.salary, salary) != 0) return false;
//        if (id != null ? !id.equals(user.id) : user.id != null) return false;
//        if (name != null ? !name.equals(user.name) : user.name != null) return false;
//        return age != null ? age.equals(user.age) : user.age == null;
//    }

//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (age != null ? age.hashCode() : 0);
//        temp = Double.doubleToLongBits(salary);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }

//    @Override
//    public String toString() {
//        return "User [id=" + id + ", name=" + name + ", age=" + age
//                + ", salary=" + salary + "]";
//    }


}
