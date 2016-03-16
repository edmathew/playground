-- Database playground creation
-- run this script > psql -U <user>  -f 01-createDatabase.sql

\set ON_ERROR_STOP 'on'

\set database_name          playground

DROP DATABASE IF EXISTS :database_name;

CREATE DATABASE :database_name
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Portugal.1252'
       LC_CTYPE = 'Portuguese_Portugal.1252'
       CONNECTION LIMIT = -1;
	   

	 