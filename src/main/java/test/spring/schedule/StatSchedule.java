package test.spring.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import test.spring.repository.UsersRepository;
import test.spring.service.StatProc;

import java.sql.Timestamp;

@Component
public class StatSchedule {

    @Autowired
    StatProc statProc;

    @Autowired
    UsersRepository usersRepository;

    @Scheduled(fixedDelay = 60000L)
    private void run(){
        System.out.println("writing stat");
        statProc.writeStat();
        usersRepository.delete(usersRepository.findByRegistrationTimeBefore(new Timestamp(System.currentTimeMillis() - 120000)));
    }

}
