package test.spring.service;

import org.springframework.stereotype.Service;
import test.spring.repository.StatisticRepository;
import test.spring.repository.UsersRepository;

@Service
public class DBService {

    private final UsersRepository usersRepository;

    private final StatisticRepository statisticRepository;

    public DBService(UsersRepository usersRepository, StatisticRepository statisticRepository) {
        this.usersRepository = usersRepository;
        this.statisticRepository = statisticRepository;

        this.usersRepository.deleteAll();
        this.statisticRepository.deleteAll();
    }
}
