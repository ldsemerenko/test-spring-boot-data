package test.spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "statistic", schema = "test_s")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "user_count_per_min")
    Integer user_count_per_min;

    @Column(name = "male_count")
    Integer male_count;

    @Column(name = "female_count")
    Integer female_count;

    @Column(name = "avg_age")
    Integer avg_age;

    @Column(name = "ua_count")
    Integer ua_count;

    @Column(name = "gb_count")
    Integer gb_count;

    @Column(name = "ca_count")
    Integer ca_count;

    @Column(name = "by_count")
    Integer by_count;

    @Column(name = "hn_count")
    Integer hn_count;

    public void setUser_count_per_min(Integer user_count_per_min) {
        this.user_count_per_min = user_count_per_min;
    }

    public void setMale_count(Integer male_count) {
        this.male_count = male_count;
    }

    public void setFemale_count(Integer female_count) {
        this.female_count = female_count;
    }

    public void setAvg_age(Integer avg_age) {
        this.avg_age = avg_age;
    }

    public void setUa_count(Integer ua_count) {
        this.ua_count = ua_count;
    }

    public void setGb_count(Integer gb_count) {
        this.gb_count = gb_count;
    }

    public void setCa_count(Integer ca_count) {
        this.ca_count = ca_count;
    }

    public void setBy_count(Integer by_count) {
        this.by_count = by_count;
    }

    public void setHn_count(Integer hn_count) {
        this.hn_count = hn_count;
    }
}
