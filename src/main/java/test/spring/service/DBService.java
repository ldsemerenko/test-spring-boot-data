package test.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.spring.repository.StatisticRepository;
import test.spring.repository.UsersRepository;

@Service("DBService")
public class DBService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    StatisticRepository statisticRepository;

    public void clearDB(){
        usersRepository.deleteAll();
        statisticRepository.deleteAll();
    }
}
