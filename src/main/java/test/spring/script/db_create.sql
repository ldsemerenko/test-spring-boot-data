CREATE role test_u;
ALTER role test_u PASSWORD 'test';
CREATE DATABASE test_db WITH OWNER test_u;
Alter user test_u with superuser login;
-------------------------------------------
CREATE SCHEMA test_s;
ALTER SCHEMA test_s OWNER TO test_u;
-------------------------------------------
CREATE SEQUENCE test_s.users_id_seq;
-------------------------------------------
CREATE TABLE test_s.users(
  id BIGINT PRIMARY KEY DEFAULT nextval('test_s.users_id_seq'),
  user_id BIGINT,
  pass TEXT,
  age INT,
  sex TEXT,
  nationality TEXT,
  registration_time TIMESTAMP
);
-------------------------------------------
CREATE SEQUENCE test_s.statistic_id_seq;
-------------------------------------------
CREATE TABLE test_s.statistic(
  id BIGINT PRIMARY KEY DEFAULT nextval('test_s.statistic_id_seq'),
  user_count_per_min INT,
  male_count INT,
  female_count INT,
  avg_age INT,
  ua_count INT,
  gb_count INT,
  ca_count INT,
  by_count INT,
  hn_count INT
);
