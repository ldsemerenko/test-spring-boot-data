package test.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.spring.domain.Statistic;

public interface StatisticRepository extends JpaRepository<Statistic, Long >{
}
