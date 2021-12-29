CREATE TABLE TB_USER (
   USER_NO NUMBER NOT NULL,
   USER_ID VARCHAR2(20) NOT NULL,
   USER_PWD VARCHAR2(20) NOT NULL,
   USER_NICKNAME VARCHAR2(20) NOT NULL,
   UESR_EMAIL VARCHAR2(20) NOT NULL,
   USER_PHONE VARCHAR2(20) NOT NULL,
   USER_JOIN_DATE DATE DEFAULT SYSDATE,
   USER_TYPE VARCHAR2(20) NOT NULL,
   USER_DELETE_YN CHAR(1) NOT NULL,
   LASTLOGIN_DATE DATE,
   CONSTRAINT PK_TB_USER PRIMARY KEY(USER_NO)
);


