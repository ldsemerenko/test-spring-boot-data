package test.spring.domain;

import test.spring.Enum.Nationality;

import javax.persistence.*;

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

    public void setId(Long user_id) {
        this.user_id = user_id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality.toString();
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nationality=" + nationality +
                '}';
    }
}
