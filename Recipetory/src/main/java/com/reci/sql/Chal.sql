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
   LASTLOGIN_DATE TIMESTAMP,
   CONSTRAINT PK_TB_USER PRIMARY KEY(USER_NO)
);

CREATE TABLE TB_BOARD_CHALLENGE (
   POST_NO   NUMBER   NOT NULL,
   POST_NAME   VARCHAR2(30)   NOT NULL,
   BEG_DATE   TIMESTAMP   NOT NULL,
   PARTI_NUM   NUMBER  DEFAULT '1',
   CHALLENGE_PERIOD   DATE   NOT NULL,
   SCRAP_NUM   NUMBER   NULL,
   COMM_NUM   NUMBER    DEFAULT '0',
   REVIEW_NUM   NUMBER    DEFAULT '0',
   REPORT_NUM   NUMBER   NULL,
   MOD_YN   CHAR(1)   DEFAULT 'N',
   FMOD_DATE   TIMESTAMP   NULL,
   DEL_YN   CHAR(1)   DEFAULT 'N',
   USER_NO   NUMBER   NOT NULL,
   CONSTRAINT PK_POST_NO PRIMARY KEY(POST_NO),
   CONSTRAINT FK_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)
);

CREATE TABLE TB_PARTICIPATE_C (
    PARTI_NO NUMBER NOT NULL,
    POST_NO NUMBER NOT NULL,
    PARTI_DATE TIMESTAMP NOT NULL,
    CANCLE_YN CHAR(1) DEFAULT 'N',
    USER_NO NUMBER NOT NULL,
    CONSTRAINT PK_PARTI_NO PRIMARY KEY(PARTI_NO),
    CONSTRAINT FK_CPART_POST_NO FOREIGN KEY(POST_NO) REFERENCES TB_BOARD_CHALLENGE(POST_NO),
    CONSTRAINT FK_CPART_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)
    );
    
CREATE TABLE TB_COMMENT_C (
   COMM_NO   NUMBER   NOT NULL,
   POST_NO   NUMBER   NOT NULL,
   COMM_CONTENT   VARCHAR2(4000)   NOT NULL,
   COMM_ORDER   NUMBER   NOT NULL,
   RECOM_NUM   NUMBER   DEFAULT '0',
   BEG_DATE   DATE   NOT NULL,
   MOD_DATE   DATE   NULL,
   REPORT_YN   CHAR(1)   DEFAULT 'N',
   MOD_YN   CHAR(1)   DEFAULT 'N',
   DEL_YN   CHAR(1)   DEFAULT 'N',
   USER_NO   NUMBER   NOT NULL,
   CONSTRAINT PK_COMM_NO PRIMARY KEY(COMM_NO),
   CONSTRAINT FK_CCOMM_POST_NO FOREIGN KEY(POST_NO) REFERENCES TB_BOARD_CHALLENGE(POST_NO),
   CONSTRAINT FK_CCOMM_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)
);

CREATE TABLE TB_RECOMMEND_COMMENT_C (
   RECOM_NO   NUMBER   NOT NULL,
   COMM_NO   NUMBER   NOT NULL,
   POST_NO   NUMBER   NOT NULL,
   RECOM_DATE   TIMESTAMP   NOT NULL,
   DEL_YN   CHAR(1)   DEFAULT 'N',
   USER_NO   NUMBER   NOT NULL,
   CONSTRAINT PK_RECOM_NO PRIMARY KEY(RECOM_NO),
   CONSTRAINT FK_CRECOM_COMM_NO FOREIGN KEY(COMM_NO) REFERENCES TB_COMMENT_C(COMM_NO),
   CONSTRAINT FK_CRECOM_POST_NO FOREIGN KEY(POST_NO) REFERENCES TB_COMMENT_C(POST_NO),
   CONSTRAINT FK_CRECOM_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)
);

CREATE TABLE TB_COMMENT_C2 (
   COMM_NO   NUMBER   NOT NULL,
   POST_NO   NUMBER   NOT NULL,
   COMM_CONTENT   VARCHAR2(4000)   NOT NULL,
   COMM_ORDER   NUMBER   NOT NULL,
   RECOM_NUM   NUMBER   DEFAULT '0',
   BEG_DATE   DATE   NOT NULL,
   MOD_DATE   DATE   NULL,
   REPORT_YN   CHAR(1)   DEFAULT 'N',
   MOD_YN   CHAR(1)   DEFAULT 'N',
   DEL_YN   CHAR(1)   DEFAULT 'N',
   USER_NO   NUMBER   NOT NULL,
   CONSTRAINT FK_CCOMM2_COMM_NO FOREIGN KEY(COMM_NO) REFERENCES TB_COMMENT_C(COMM_NO),
   CONSTRAINT FK_CCOMM2_POST_NO FOREIGN KEY(POST_NO) REFERENCES TB_COMMENT_C(POST_NO),
   CONSTRAINT FK_CCOMM2_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)
);

CREATE TABLE TB_SCRAP_C(
    SCRAP_NO NUMBER NOT NULL,
    POST_NO NUMBER NOT NULL,
    SCRAP_DATE TIMESTAMP NOT NULL,
    DEL_YN CHAR(1) DEFAULT 'N',
    USER_NO NUMBER NOT NULL,
    CONSTRAINT PK_SCRAP_NO PRIMARY KEY(SCRAP_NO),
    CONSTRAINT FK_CSCR_POST_NO FOREIGN KEY(POST_NO) REFERENCES TB_BOARD_CHALLENGE(POST_NO),
    CONSTRAINT FK_CSCR_USER_NO FOREIGN KEY(USER_NO) REFERENCES TB_USER(USER_NO)   
    );