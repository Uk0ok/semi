DROP TABLE TB_USER CASCADE CONSTRAINTS;

CREATE TABLE TB_USER (
   USER_NO NUMBER NOT NULL,
   USER_ID VARCHAR2(20) NOT NULL,
   USER_PWD VARCHAR2(20) NOT NULL,
   USER_NICKNAME VARCHAR2(20) NOT NULL,
   UESR_EMAIL VARCHAR2(20) NOT NULL,
   USER_PHONE VARCHAR2(20) NOT NULL,
   USER_JOIN_DATE TIMESTAMP DEFAULT SYSDATE,
   USER_TYPE VARCHAR2(20) NOT NULL,
   USER_DELETE_YN CHAR(1) NOT NULL,
   LASTLOGIN_DATE TIMESTAMP,
   CONSTRAINT PK_TB_USER PRIMARY KEY(USER_NO)
);
/* USER 테이블 */


DROP TABLE TB_BOARD_RECIPE CASCADE CONSTRAINTS;

CREATE TABLE TB_BOARD_RECIPE (
   POST_NO   NUMBER   NOT NULL,
   POST_NAME   VARCHAR2(30)  NOT NULL,
   BEG_DATE   TIMESTAMP   NULL,
   HITS   NUMBER   DEFAULT '0',
   RECOM_NUM   NUMBER   DEFAULT '0',
   SCRAP_NUM   NUMBER  ,
   COMM_NUM   NUMBER   DEFAULT '0',
   REVIEW_NUM   NUMBER   DEFAULT '0',
   REPORT_NUM   NUMBER,
   DIFFICULTY   VARCHAR(10),
   REQ_TIME   VARCHAR(10),
   CATEGORY   VARCHAR(20),
   TAG   VARCHAR(20),
   MOD_YN   CHAR(1)  DEFAULT 'N',
   DEL_YN   CHAR(1)   DEFAULT 'N',
   FMOD_DATE   TIMESTAMP,
   USER_NO   NUMBER   NOT NULL,
   CONSTRAINT PK_POST_NO PRIMARY KEY(POST_NO),
   CONSTRAINT FK_RBOARD_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)
);
/* TB_BOARD_RECIP */

DROP TABLE TB_SCRAP_R CASCADE CONSTRAINTS;

CREATE TABLE TB_SCRAP_R (
   SCRAP_NO   NUMBER   NOT NULL,
   POST_NO   NUMBER   NOT NULL,
   SCARP_DATE   TIMESTAMP  ,
   DEL_YN  CHAR(1) DEFAULT 'N',
   USER_NO   NUMBER  ,
   CONSTRAINT PK_RSCRAP_NO PRIMARY KEY(SCRAP_NO),
   CONSTRAINT FK_RSCRAP_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO),
   CONSTRAINT FK_RSCRAP_POST_NO FOREIGN KEY(POST_NO) REFERENCES TB_BOARD_RECEIPT(POST_NO)
);

DROP TABLE TB_COMMNET_R CASCADE CONSTRAINTS;

CREATE TABLE TB_COMMNET_R (
   COMM_NO   NUMBER   NOT NULL,
   POST_NO   NUMBER   NOT NULL,
   COMM_CONTENT   VARCHAR2(4000)   NULL,
   COMM_ORDER   NUMBER  NULL,
   RECOM_NUM   NUMBER  DEFAULT '0',
   BEG_DATE   TIMESTAMP   ,
   MOD_DATE   TIMESTAMP   ,
   REPORT_YN   CHAR(1) DEFAULT 'N',
   MOD_YN   CHAR(1)   DEFAULT 'N',
   DEL_YN   CHAR(1)  DEFAULT 'N',
   USER_NO   NUMBER   NOT NULL,
   CONSTRAINT PK_COMM_NO PRIMARY KEY(COMM_NO),
   CONSTRAINT FK_RCOMMENT_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)
);

DROP TABLE TB_COMMNET_R2 CASCADE CONSTRAINTS;

CREATE TABLE TB_COMMENT_R2 (
   COMM_NO   NUMBER   NOT NULL,
   POST_NO   NUMBER   NOT NULL,
   COMM_CONTENT   VARCHAR(255)   NULL,
   COMM_ORDER   VARCHAR(255)   NULL,
   RECOM_NUM   NUMBER  DEFAULT '0',
   BEG_DATE   DATE   NULL,
   REPORT_YN   CHAR(1) DEFAULT 'N',
   MOD_YN   CHAR(1)  DEFAULT 'N',
   DEL_YN   CHAR(1)  DEFAULT 'N',
   USER_NO2   NUMBER   NOT NULL
);

DROP TABLE TB_ATTACHED_FILE_S CASCADE CONSTRAINTS;

CREATE TABLE TB_ATTACHED_FILE_S (
   FILE_NO   NUMBER   NOT NULL,
   POST_NO   NUMBER   NOT NULL,
   FILE_NAME   VARCHAR2(100)   NOT NULL,
   MFILE_NAME   VARCHAR2(100)   NULL,
   USER_NO   NUMBER   NOT NULL,
   CONSTRAINT PK_FILE_NO PRIMARY KEY(FILE_NO),
   CONSTRAINT FK_RFILE_POST_NO FOREIGN KEY(POST_NO) REFERENCES TB_BOARD_RECEIPT(POST_NO)
);