CREATE role accounting;
ALTER role accounting PASSWORD 'pword';
CREATE DATABASE accounting_db WITH OWNER accounting;
-------------------------------------------
CREATE SCHEMA c_accounting;
ALTER SCHEMA c_accounting OWNER TO accounting;
Alter user accounting with superuser login;
-----
CREATE SEQUENCE c_accounting.users_id_seq;
-----
CREATE TABLE c_accounting.users(
  id BIGINT PRIMARY KEY DEFAULT nextval('c_accounting.users_id_seq'),
  nick_name TEXT,
  role TEXT,
  first_name TEXT,
  last_name TEXT,
  pass TEXT,
  phone_num TEXT,
  email TEXT
);
-----
CREATE SEQUENCE c_accounting.expenses_id_seq;
-----
CREATE TABLE c_accounting.expenses(
  id BIGINT PRIMARY KEY DEFAULT nextval('c_accounting.expenses_id_seq'),
  date TIMESTAMP,
  currency TEXT,
  amount MONEY,
  id_user BIGINT,
  category TEXT,
  origin TEXT,
  note TEXT
);
-----
CREATE SEQUENCE c_accounting.files_id_seq;
-----
CREATE TABLE c_accounting.files(
  id BIGINT PRIMARY KEY DEFAULT nextval('c_accounting.files_id_seq'),
  file bytea,
  id_expense BIGINT,
  note TEXT
);
-----
