package test.spring.domain;

import test.spring.Enum.Nationality;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table( schema = "test_s",name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "user_id")
    Long user_id;

    @Column(name = "pass")
    String pass;

    @Column(name = "age")
    Integer age;

    @Column(name = "sex")
    String sex;

    @Column(name = "nationality")
    String nationality;

    @Column(name = "registration_time")
    Timestamp registrationTime;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Timestamp getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime) {
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                ", registrationTime=" + registrationTime +
                '}';
    }
}
