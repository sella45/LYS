USE practice_sql;

CREATE TABLE sample_table_1 (
	pk_column VARCHAR(20) PRIMARY KEY,
    sample_column_1 INT NOT NULL,
    sample_column_2 BOOLEAN
    );

    CREATE TABLE sample_table_2 (
        ai_pk INT AUTO_INCREMENT PRIMARY KEY,
        sample_column VARCHAR(20)
    );
    
    SELECT * FROM sample_table_1;
    