# ORACLE Tips and Tricks
----------

- **NULL** - Nothing is equal to null. If you want to get null values, use `<field> is null`

- **CHAR vs VARCHAR2**
	- Use **CHAR** if the field varies his length a lot of times during the register life-cycle.
	- Use **VARCHAR2** is the value doesn't change much during the register life-cycle.
	
----------

- **Dates**
	- Always use explicit date conversion with the funcion `TO_DATE(text, format)`
	- To display a date with a specific format use `TO_CHAR(dateField, format)`

----------

- **String Manipulation**
	- `UPPER()`, `LOWER()` UpperCase and Lowercase convertion
	- `SUBSTR(text, begin[, end]) ` Substring of a field
		- If begin < 0, SUBSTR the substring begins in char length + begin
	- `INSTR() ` Search for a substring in a field
	- `LPAD | RPAD () ` Left and right padding

----------
- **Special Fields in all tables**
	- `rowid`  Unique identifier for a row in all database
	- `rownum` List index in the resultSet.

----------