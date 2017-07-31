package test.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.spring.domain.Users;

import java.sql.Timestamp;
import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long>{
    List<Users> findByRegistrationTimeBefore(Timestamp timestamp);
//    void deleteByRegistrationTimeBefore(Timestamp timestamp);
}
