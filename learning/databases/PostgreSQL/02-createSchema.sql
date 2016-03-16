\set ON_ERROR_STOP 'on'

\set database_name          playground
\set fileHandlerSchema      FileHandler 

\connect :database_name;	   

DROP SCHEMA IF EXISTS :fileHandlerSchema CASCADE;
	
-- FileHandler stores information about file read and/or write in the file system
CREATE SCHEMA :fileHandlerSchema;	 

CREATE TABLE :fileHandlerSchema.fileConfig(
    FILE_CODE   CHAR(05)    NOT NULL,
    FILE_TYPE   CHAR(05)    NOT NULL,
    FILE_NAME   TEXT        NOT NULL,
    FILE_ACTION CHAR(01)    NOT NULL,
    
    PRIMARY KEY (FILE_CODE)
); 

CREATE INDEX fileConfig_idx1 
    ON :fileHandlerSchema.fileConfig(FILE_CODE);

	 