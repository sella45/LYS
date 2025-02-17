USE practice_sql;

-- 데이터 제어어(DCL) : 데이터베이스의 보안과 관련된 권한을 관리하는데 사용되는 언어 
-- 사용자에게 스키마에 대한 권한 부여 및 회수에 사용

-- 1. GRANT : 특정 사용자에게 스키마에 대한 권한을 부여하는 명령어
-- 사용방법: GRANT 권한리스트 ON 데이터베이스명.테이블 TO 유저이름@호스트;

GRANT SELECT, INSERT ON practice_sql.example_table
TO 'developer'@'%';




-- 2. REVOCK : 사용자에게 부여된 권한을 취소하는데 사용

