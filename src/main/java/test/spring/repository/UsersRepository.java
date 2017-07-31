package test.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.spring.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
}
