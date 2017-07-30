package test.spring.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( schema = "test_s",name = "user")
public class User {
}
