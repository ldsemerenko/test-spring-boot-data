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
  pass TEXT,
  age int,
  sex TEXT,
  nationality TEXT
);

/*
случайными не
числовым идентификатором(не могут повторяться), паролем, возрастом, полом, национальностью*/
