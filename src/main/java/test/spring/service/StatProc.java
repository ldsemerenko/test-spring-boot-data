package test.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.spring.domain.Statistic;
import test.spring.domain.Users;
import test.spring.repository.StatisticRepository;
import test.spring.repository.UsersRepository;

import java.sql.Timestamp;

@Service("StatisticProcessor")
public class StatProc {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    StatisticRepository statisticRepository;

    public void writeStat(){
        statisticRepository.save(calcStat());
    }

    private Statistic calcStat(){
        Integer user_count_per_min = 0;
        Integer male_count  = 0;
        Integer female_count = 0;
        Integer sum_avg_age = 0;
        Integer ua_count = 0;
        Integer gb_count = 0;
        Integer ca_count = 0;
        Integer by_count = 0;
        Integer hn_count = 0;
        for (Users u :usersRepository.findByRegistrationTimeBefore(new Timestamp(System.currentTimeMillis() - 60000))) {
            user_count_per_min++;
            sum_avg_age+=u.getAge();
            if(u.getSex().equals("male")) male_count++; else female_count++;
            switch (u.getNationality()){
                case "UA" : ua_count++; break;
                case "GB" : gb_count++; break;
                case "CA" : ca_count++; break;
                case "BY" : by_count++; break;
                case "HN" : hn_count++; break;
            }
        }

        Statistic statistic = new Statistic();
        statistic.setUser_count_per_min(user_count_per_min);

        statistic.setAvg_age(sum_avg_age / user_count_per_min == 0 ? 1 : user_count_per_min);
        statistic.setMale_count(male_count);
        statistic.setFemale_count(female_count);
        statistic.setBy_count(by_count);
        statistic.setCa_count(ca_count);
        statistic.setGb_count(gb_count);
        statistic.setHn_count(hn_count);
        statistic.setUa_count(ua_count);

        return statistic;
    }
}
