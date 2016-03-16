\set ON_ERROR_STOP 'on'

\set database_name          playground
\set fileHandlerSchema      FileHandler 

\connect :database_name;	 

DELETE FROM :fileHandlerSchema.fileConfig WHERE 1 = 1;

INSERT INTO  :fileHandlerSchema.fileConfig VALUES 
('FIL0', 'CSV', 'The zero file', 'W'),
('OUT1', 'XLS', 'Report ', 'W'),
('CNF', 'KV', 'Config master file', 'R')
;
