-- Role: ediuser
-- DROP ROLE IF EXISTS ediuser;

CREATE ROLE ediuser WITH
  LOGIN
  NOSUPERUSER
  INHERIT
  CREATEDB
  NOCREATEROLE
  REPLICATION;


-- Database: EdiDB

-- DROP DATABASE IF EXISTS "EdiDB";

CREATE DATABASE "EdiDB"
    WITH 
    OWNER = ediuser
    ENCODING = 'UTF8'
    LC_COLLATE = 'Japanese_Japan.932'
    LC_CTYPE = 'Japanese_Japan.932'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


-- Database: TestDB

-- DROP DATABASE IF EXISTS "TestDB";

CREATE DATABASE "TestDB"
    WITH 
    OWNER = ediuser
    ENCODING = 'UTF8'
    LC_COLLATE = 'Japanese_Japan.932'
    LC_CTYPE = 'Japanese_Japan.932'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
