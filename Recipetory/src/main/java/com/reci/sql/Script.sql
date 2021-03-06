DROP TABLE MAG_REPORT;
DROP TABLE TB_RECOMMEND_COMMENT_M;
DROP TABLE TB_RECOMMEND_M;
DROP TABLE TB_SCRAP_M;
DROP TABLE TB_ATTACHED_FILE_M;
DROP TABLE TB_COMMENT_M2;
DROP TABLE TB_COMMENT_M;
DROP TABLE TB_BOARD_MAGAZINE;
DROP TABLE TB_ATTACHED_FILE_RP;
DROP TABLE TB_REPORT;
DROP TABLE TB_ATTACHED_FILE_Q;
DROP TABLE TB_QNA;
DROP TABLE TB_ATTACHED_FILE_N;
DROP TABLE TB_NOTICE;
DROP TABLE TB_ADMIN;
DROP TABLE TB_USER;
DROP TABLE TB_BOARD_CHALLENGE;
DROP TABLE TB_COMMENT_C;
DROP TABLE TB_COMMENT_C2;
DROP TABLE TB_ATTACHED_FILE_C;
DROP TABLE TB_SCRAP_C;
DROP TABLE TB_PARTICIPATE_C;
DROP TABLE TB_RECOMMEND_COMMENT_C;
DROP TABLE CHA_REPORT;
DROP TABLE TB_BOARD_RECEIPT;
DROP TABLE TB_BOARD_RECIPE;
DROP TABLE TB_COMMNET_R;
DROP TABLE TB_COMMENT_R2;
DROP TABLE TB_ATTACHED_FILE_R;
DROP TABLE TB_SCRAP_R;
DROP TABLE TB_RECOMMEND_R;
DROP TABLE TB_RECOMMEND_COMMENT_R;
DROP TABLE REC_REPORT;

DROP SEQUENCE SEQ_MAG_RCNO;
DROP SEQUENCE SEQ_MAG_RNO;
DROP SEQUENCE SEQ_MAG_SNO;
DROP SEQUENCE SEQ_MAG_FNO;
DROP SEQUENCE SEQ_MAG_CNO;
DROP SEQUENCE SEQ_MAG_PNO;
DROP SEQUENCE SEQ_REPORT;
DROP SEQUENCE SEQ_QNA;
DROP SEQUENCE SEQ_NOTICE;
DROP SEQUENCE SEQ_ADMIN;
DROP SEQUENCE SEQ_UNO;

COMMIT;

-------------------------------회원 테이블 생성
DROP TABLE TB_USER;
CREATE TABLE TB_USER (
   USER_NO NUMBER NOT NULL,
   USER_ID VARCHAR2(30) NOT NULL,
   USER_PWD VARCHAR2(100) NOT NULL,
   USER_NICKNAME VARCHAR2(30) NOT NULL,
   USER_EMAIL VARCHAR2(100) NOT NULL,
   USER_PHONE VARCHAR2(13) NOT NULL,
   USER_JOIN_DATE TIMESTAMP DEFAULT SYSDATE NOT NULL,
   USER_TYPE CHAR(1) DEFAULT 'G' NOT NULL,
   USER_DELETE_YN VARCHAR2(1) DEFAULT 'N' CHECK(USER_DELETE_YN IN('Y', 'N')), --CHECK(컬럼명 IN('Y' , 'N'))은 둘중 하나만 들어갈수 있다는 것.
   LASTLOGIN_DATE TIMESTAMP DEFAULT SYSDATE NOT NULL,
   CONSTRAINT PK_TB_USER PRIMARY KEY(USER_NO),
   CONSTRAINT CHK_USER_DELETE_YN CHECK (USER_DELETE_YN IN ('Y','N'))
)
;

--회원 코멘트 생성
COMMENT ON COLUMN TB_USER.USER_NO IS '회원 번호';
COMMENT ON COLUMN TB_USER.USER_ID IS '아이디';
COMMENT ON COLUMN TB_USER.USER_PWD IS '비밀번호';
COMMENT ON COLUMN TB_USER.USER_NICKNAME IS '닉네임';
COMMENT ON COLUMN TB_USER.USER_EMAIL IS '이메일';
COMMENT ON COLUMN TB_USER.USER_PHONE IS '전화번호';
COMMENT ON COLUMN TB_USER.USER_JOIN_DATE IS '가입 일자';
COMMENT ON COLUMN TB_USER.USER_TYPE IS '회원 구분 G/Y';
COMMENT ON COLUMN TB_USER.USER_DELETE_YN IS '탈퇴 여부';
COMMENT ON COLUMN TB_USER.LASTLOGIN_DATE IS '마지막 로그인 일자';

DROP SEQUENCE SEQ_UNO;
CREATE SEQUENCE SEQ_UNO; --회원번호 PK값 만들어주기 위한 시퀀스.(회원가입 하면서 번호 붙여지게)

INSERT INTO TB_USER ( --관리자 계정 추가. admin ssh
    USER_NO,
    USER_ID,
    USER_PWD,
    USER_NICKNAME,
    USER_EMAIL,
    USER_PHONE,
    USER_JOIN_DATE,
    USER_TYPE,
    USER_DELETE_YN,
    LASTLOGIN_DATE
    ) VALUES(
    SEQ_UNO.NEXTVAL,
    'admin_ssh',
    'admin_ssh',
    '관리자 서성환',
    'thespeace1@gmail.com',
    '010-2015-9465',
    default,
    default,
    default,
    default
    );
    
    
INSERT INTO TB_USER(
	USER_NO, USER_ID,  USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN, LASTLOGIN_DATE
	) VALUES (
	SEQ_UNO.NEXTVAL, 'red',  '111',  '빨강이', 'red@gmail.com', '010-1111-1111', DEFAULT, DEFAULT, DEFAULT, DEFAULT );
INSERT INTO TB_USER (
	USER_NO, USER_ID,  USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN, LASTLOGIN_DATE
	) VALUES (
	SEQ_UNO.NEXTVAL, 'orange',  '222',  '주황이', 'orange@gmail.com', '010-2222-2222',  DEFAULT, DEFAULT, DEFAULT, DEFAULT );
INSERT INTO TB_USER (
	USER_NO, USER_ID,  USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN, LASTLOGIN_DATE
	) VALUES (
	SEQ_UNO.NEXTVAL, 'yellow',  '333',  '노랑이', 'yellow@gmail.com', '010-3333-3333', DEFAULT, DEFAULT, DEFAULT, DEFAULT );
INSERT INTO TB_USER (
	USER_NO, USER_ID,  USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN, LASTLOGIN_DATE
	) VALUES (
	SEQ_UNO.NEXTVAL, 'green',  '444',  '초록이', 'green@gmail.com', '010-4444-4444', DEFAULT, DEFAULT, DEFAULT, DEFAULT );
INSERT INTO TB_USER (
	USER_NO, USER_ID,  USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN, LASTLOGIN_DATE
	) VALUES (
	SEQ_UNO.NEXTVAL, 'blue',  '555',  '파랑이', 'blue@gmail.com', '010-5555-5555', DEFAULT, DEFAULT, DEFAULT, DEFAULT );
INSERT INTO TB_USER (
	USER_NO, USER_ID,  USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN, LASTLOGIN_DATE
	) VALUES (
	SEQ_UNO.NEXTVAL, 'navy',  '666',  '남이', 'navy@gmail.com', '010-6666-6666', DEFAULT, DEFAULT, DEFAULT, DEFAULT );
INSERT INTO TB_USER (
	USER_NO, USER_ID,  USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN, LASTLOGIN_DATE
	) VALUES (
	SEQ_UNO.NEXTVAL, 'purple',  '777',  '보라', 'purple@gmail.com', '010-7777-7777', DEFAULT, DEFAULT, DEFAULT, DEFAULT );



--------------------------------관리자 테이블 생성
DROP TABLE TB_ADMIN;
CREATE TABLE TB_ADMIN (
   ADMIN_NO NUMBER NOT NULL,
   ADMIN_ID VARCHAR2(30) NOT NULL,
   ADMIN_PWD VARCHAR2(100) NOT NULL,
   ADMIN_NAME VARCHAR2(30) NOT NULL,
   ADMIN_LV VARCHAR2(30) DEFAULT 'Lv1' NOT NULL,
   JOIN_DATE TIMESTAMP DEFAULT SYSDATE,
   DELETE_DATE TIMESTAMP,
   CONSTRAINT PK_TB_ADMIN PRIMARY KEY(ADMIN_NO)
);

DROP SEQUENCE SEQ_ADMIN;
CREATE SEQUENCE SEQ_ADMIN;

--관리자 테이블에 값 입력
INSERT INTO TB_ADMIN (
	ADMIN_NO, ADMIN_ID,  ADMIN_PWD, ADMIN_NAME, ADMIN_LV, JOIN_DATE, DELETE_DATE
	) VALUES (
	SEQ_ADMIN.NEXTVAL, 'admin1',  'aaa',  '강동원', DEFAULT, DEFAULT, DEFAULT );
INSERT INTO TB_ADMIN (
	ADMIN_NO, ADMIN_ID,  ADMIN_PWD, ADMIN_NAME, ADMIN_LV, JOIN_DATE, DELETE_DATE
	) VALUES (
	SEQ_ADMIN.NEXTVAL, 'admin2',  'bbb',  '이지은', 'Lv3', DEFAULT, DEFAULT );
INSERT INTO TB_ADMIN (
	ADMIN_NO, ADMIN_ID,  ADMIN_PWD, ADMIN_NAME, ADMIN_LV, JOIN_DATE, DELETE_DATE
	) VALUES (
	SEQ_ADMIN.NEXTVAL, 'admin3',  'ccc',  '최우식', 'Lv2', DEFAULT, DEFAULT );
INSERT INTO TB_ADMIN (
	ADMIN_NO, ADMIN_ID,  ADMIN_PWD, ADMIN_NAME, ADMIN_LV, JOIN_DATE, DELETE_DATE
	) VALUES (
	SEQ_ADMIN.NEXTVAL, 'admin4',  'ddd',  '제임스', 'Lv2', DEFAULT, DEFAULT );
INSERT INTO TB_ADMIN (
	ADMIN_NO, ADMIN_ID,  ADMIN_PWD, ADMIN_NAME, ADMIN_LV, JOIN_DATE, DELETE_DATE
	) VALUES (
	SEQ_ADMIN.NEXTVAL, 'admin5',  'eee',  '찰스', DEFAULT, DEFAULT, DEFAULT );


--------------------------------------------------------------------
--공지사항 테이블 생성
DROP TABLE TB_NOTICE;
CREATE TABLE TB_NOTICE (
   NOTICE_NO NUMBER NOT NULL,
   ADMIN_NO NUMBER NOT NULL,
   NOTICE_TITLE VARCHAR2(255) NOT NULL,
   NOTICE_CONTENT VARCHAR2(4000) NOT NULL,
   CREATE_DATE TIMESTAMP DEFAULT SYSDATE NOT NULL,
   HITS NUMBER DEFAULT '0' NOT NULL,
   MOD_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(MOD_YN IN('Y', 'N')),
   MOD_DATE  TIMESTAMP DEFAULT SYSDATE,
   DELETE_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(DELETE_YN IN('Y', 'N')),
   CONSTRAINT PK_TB_NOTICE PRIMARY KEY(NOTICE_NO),
   CONSTRAINT FK_TB_NOTICE FOREIGN KEY(ADMIN_NO)
   REFERENCES TB_ADMIN(ADMIN_NO)
);

DROP SEQUENCE SEQ_NOTICE;
CREATE SEQUENCE SEQ_NOTICE;

--공지사항 테이블에 값 입력
INSERT INTO TB_NOTICE (
	NOTICE_NO, ADMIN_NO, NOTICE_TITLE,  NOTICE_CONTENT, CREATE_DATE, HITS, MOD_YN, MOD_DATE, DELETE_YN
	) VALUES (
	SEQ_NOTICE.NEXTVAL, '1', '레시피토리 오픈 안내',  '공지사항 내용',  DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO TB_NOTICE (
	NOTICE_NO, ADMIN_NO, NOTICE_TITLE,  NOTICE_CONTENT,  CREATE_DATE, HITS,  MOD_YN, MOD_DATE, DELETE_YN
	) VALUES (
	SEQ_NOTICE.NEXTVAL,  '2', '서비스 이용약관 개정 안내',  '공지사항 내용', DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO TB_NOTICE (
	NOTICE_NO, ADMIN_NO, NOTICE_TITLE,  NOTICE_CONTENT,  CREATE_DATE, HITS,  MOD_YN, MOD_DATE, DELETE_YN
	) VALUES (
	SEQ_NOTICE.NEXTVAL, '3', '서비스 개편 및 이용안내',  '공지사항 내용', DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO TB_NOTICE (
	NOTICE_NO, ADMIN_NO, NOTICE_TITLE,  NOTICE_CONTENT,  CREATE_DATE, HITS,  MOD_YN, MOD_DATE, DELETE_YN
	) VALUES (
	SEQ_NOTICE.NEXTVAL, '4', '업그레이드 안내 공지',  '공지사항 내용',  DEFAULT, DEFAULT, DEFAULT, DEFAULT, DEFAULT);
    
--공지사항 첨부파일 테이블 생성
DROP TABLE TB_ATTACHED_FILE_N;
CREATE TABLE TB_ATTACHED_FILE_N (
	FILE_NO NUMBER NOT NULL,
    NOTICE_NO NUMBER NOT NULL,
    ADMIN_NO NUMBER NOT NULL,
	FILE_NAME VARCHAR2(255) NOT NULL,
	MFILE_NAME VARCHAR2(255) NOT NULL,
	CONSTRAINT PK_TB_ATTACHED_FILE_N PRIMARY KEY(FILE_NO),
	CONSTRAINT FK_TB_ATTACHED_FILE_N FOREIGN KEY(NOTICE_NO)
    REFERENCES TB_NOTICE(NOTICE_NO),
    FOREIGN KEY (ADMIN_NO) REFERENCES TB_NOTICE
);

--------------------------------------------------------------------------------

--고객 문의사항 테이블 생성
DROP TABLE TB_QNA;
CREATE TABLE TB_QNA (
   QNA_NO NUMBER NOT NULL,
   QNA_TITLE VARCHAR2(255) NOT NULL,
   QNA_CONTENT VARCHAR2(4000) NOT NULL,
   USER_NO NUMBER NOT NULL,
   ADMIN_NO NUMBER,
   CREATE_DATE TIMESTAMP DEFAULT SYSDATE NOT NULL,
   HITS NUMBER DEFAULT '0' NOT NULL,
   ANSWER VARCHAR2(4000),
   MOD_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(MOD_YN IN('Y', 'N')),
   MOD_DATE  TIMESTAMP DEFAULT SYSDATE,
   STATUS_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(STATUS_YN IN('Y', 'N')),
   DELETE_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(DELETE_YN IN('Y', 'N'))
);
ALTER TABLE TB_QNA ADD CONSTRAINT PK_TB_QNA PRIMARY KEY (QNA_NO,USER_NO);
ALTER TABLE TB_QNA ADD CONSTRAINT FK_TB_USER_TO_TB_QNA_1 FOREIGN KEY (USER_NO)
REFERENCES TB_USER (USER_NO);

ALTER TABLE TB_QNA ADD CONSTRAINT FK_TB_ADMIN_TO_TB_QNA FOREIGN KEY (ADMIN_NO)
REFERENCES TB_ADMIN (ADMIN_NO);

DROP SEQUENCE SEQ_QNA;
CREATE SEQUENCE SEQ_QNA;


--문의사항 테이블에 값 입력
INSERT INTO TB_QNA (
	QNA_NO, QNA_TITLE, QNA_CONTENT, USER_NO, ADMIN_NO, CREATE_DATE, HITS, ANSWER, MOD_YN, MOD_DATE, STATUS_YN, DELETE_YN
	) VALUES (
	SEQ_QNA.NEXTVAL, '회원가입 문의',  '문의사항 내용', '1', '1',  DEFAULT, DEFAULT,'답변내용',DEFAULT, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO TB_QNA (
	QNA_NO, QNA_TITLE, QNA_CONTENT, USER_NO, ADMIN_NO, CREATE_DATE, HITS, ANSWER, MOD_YN, MOD_DATE, STATUS_YN, DELETE_YN
	) VALUES (
	SEQ_QNA.NEXTVAL, '레시피 올리는 방법',  '문의사항 내용', '4', '1', DEFAULT, DEFAULT,'답변내용',DEFAULT, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO TB_QNA (
	QNA_NO, QNA_TITLE, QNA_CONTENT, USER_NO, ADMIN_NO, CREATE_DATE, HITS, ANSWER, MOD_YN, MOD_DATE, STATUS_YN, DELETE_YN
	) VALUES (
	SEQ_QNA.NEXTVAL, '비밀번호 변경',  '문의사항 내용', '3', '3', DEFAULT, DEFAULT,'답변내용',DEFAULT, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO TB_QNA (
	QNA_NO, QNA_TITLE, QNA_CONTENT, USER_NO, ADMIN_NO, CREATE_DATE, HITS, ANSWER, MOD_YN, MOD_DATE, STATUS_YN, DELETE_YN
	) VALUES (
	SEQ_QNA.NEXTVAL, '레시피 수정',  '문의사항 내용', '2', '2', DEFAULT, DEFAULT,'답변내용',DEFAULT, DEFAULT, DEFAULT, DEFAULT);
INSERT INTO TB_QNA (
	QNA_NO, QNA_TITLE, QNA_CONTENT, USER_NO, ADMIN_NO, CREATE_DATE, HITS, ANSWER, MOD_YN, MOD_DATE, STATUS_YN, DELETE_YN
	) VALUES (
	SEQ_QNA.NEXTVAL,'동영상 첨부 방법 문의',  '문의사항 내용', '1', '1', DEFAULT, DEFAULT,'답변내용',DEFAULT, DEFAULT, DEFAULT, DEFAULT);

--문의사항 첨부파일 테이블 생성
DROP TABLE TB_ATTACHED_FILE_Q;
CREATE TABLE TB_ATTACHED_FILE_Q (
	FILE_NO	NUMBER		NOT NULL,
	QNA_NO	NUMBER		NOT NULL,
	USER_NO	NUMBER		NOT NULL,
	FILE_NAME	VARCHAR2(255)		NOT NULL,
	MFILE_NAME	VARCHAR2(255)		NOT NULL,
    CONSTRAINT PK_TB_ATTACHED_FILE_Q PRIMARY KEY(FILE_NO),
    CONSTRAINT FK_TB_ATTACHED_FILE_Q FOREIGN KEY(QNA_NO)
    REFERENCES TB_QNA(QNA_NO),
); --왜안만들어져 씨발


--신고 테이블 생성
DROP TABLE TB_REPORT;
CREATE TABLE TB_REPORT (
   REPORT_NO NUMBER NOT NULL,
   REPORT_TITLE VARCHAR2(255) NOT NULL,
   REPORT_CONTENT VARCHAR2(4000) NOT NULL,
   CREATE_DATE TIMESTAMP DEFAULT SYSDATE NOT NULL,
   HITS NUMBER DEFAULT '0' NOT NULL,
   ANSWER VARCHAR2(4000),
   MOD_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(MOD_YN IN('Y', 'N')),
   MOD_DATE  TIMESTAMP DEFAULT SYSDATE,
   STATUS_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(STATUS_YN IN('Y', 'N')),
   DELETE_YN CHAR(1) DEFAULT 'N' NOT NULL CHECK(DELETE_YN IN('Y', 'N')),
   ADMIN_NO NUMBER,
   CONSTRAINT PK_TB_REPORT PRIMARY KEY(REPORT_NO),
   CONSTRAINT FK_TB_REPORT_ADMIN FOREIGN KEY (ADMIN_NO) REFERENCES TB_ADMIN(ADMIN_NO)
);

DROP SEQUENCE SEQ_REPORT;
CREATE SEQUENCE SEQ_REPORT;
--모든 게시글 신고 시퀀스로 사용 SEQ_REPORT

--신고 테이블에 값 입력
INSERT INTO TB_REPORT (
	REPORT_NO, REPORT_TITLE, REPORT_CONTENT, CREATE_DATE, HITS, ANSWER, MOD_YN, MOD_DATE, STATUS_YN, DELETE_YN, ADMIN_NO
	) VALUES (
	SEQ_REPORT.NEXTVAL,'게시글 신고',  '신고 내용',  DEFAULT, DEFAULT,'답변내용',DEFAULT, DEFAULT, DEFAULT, DEFAULT, '1');
    
    

—신고 첨부파일 테이블 생성
DROP TABLE TB_ATTACHED_FILE_RP;
CREATE TABLE TB_ATTACHED_FILE_RP (
	FILE_NO NUMBER NOT NULL,
	FILE_NAME VARCHAR2(255) NOT NULL,
	MFILE_NAME VARCHAR2(255) NOT NULL,
    REPORT_NO NUMBER NOT NULL,
	CONSTRAINT PK_ATTACHED_RP PRIMARY KEY(FILE_NO),
    CONSTRAINT FK_TB_ATTACHED_FILE_RP FOREIGN KEY(REPORT_NO)
    REFERENCES TB_REPORT(REPORT_NO)
);

------------------------------------------매거진---------------------------------------------------
--매거진 게시글 테이블 생성
DROP TABLE TB_BOARD_MAGAZINE;
CREATE TABLE TB_BOARD_MAGAZINE (
	POST_NO	        NUMBER                  NOT NULL,
	USER_NO	        NUMBER	                NOT NULL,
	POST_NAME	    VARCHAR2(255)           NOT NULL,
	POST_CONTENT	VARCHAR2(4000)          NOT NULL,
	BEG_DATE	    TIMESTAMP DEFAULT SYSDATE	NOT NULL,
	HITS	        NUMBER  DEFAULT '0' 	NOT NULL,
	RECOM_NUM   	NUMBER	DEFAULT '0'     NOT NULL,
	SCRAP_NUM	    NUMBER	DEFAULT '0'     NOT NULL,
	COMM_NUM	    NUMBER	DEFAULT '0'     NOT NULL,
	MOD_YN	        CHAR(1)	DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	FMOD_DATE   	TIMESTAMP DEFAULT SYSDATE NOT NULL,
	DEL_YN	        CHAR(1) DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_BOARD_MAGAZINE PRIMARY KEY(POST_NO),
    CONSTRAINT FK_TB_BOARD_MAGAZINE FOREIGN KEY(USER_NO)
    REFERENCES TB_USER(USER_NO)
)
;



--매거진 게시글 코멘트 생성
COMMENT ON COLUMN TB_BOARD_MAGAZINE.POST_NO IS '매거진 게시글 번호';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.USER_NO IS '회원 번호';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.POST_NAME IS '매거진명';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.POST_CONTENT IS '매거진 본문 내용';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.BEG_DATE IS '작성일';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.HITS IS '조회 수';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.RECOM_NUM IS '추천 수';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.SCRAP_NUM IS '스크랩 수';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.COMM_NUM IS '댓글 수';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.MOD_YN IS '수정 여부';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.FMOD_DATE IS '마지막 수정일자';
COMMENT ON COLUMN TB_BOARD_MAGAZINE.DEL_YN IS '삭제 여부';

DROP SEQUENCE SEQ_MAG_PNO;
CREATE SEQUENCE SEQ_MAG_PNO;



-------------------------------------매거진 댓글
DROP TABLE TB_COMMENT_M;
CREATE TABLE TB_COMMENT_M (
	COMM_NO	        NUMBER	NOT NULL,
	POST_NO	        NUMBER	NOT NULL,
	USER_NO	        NUMBER	NOT NULL,
	COMM_CONTENT	VARCHAR2(4000)	NOT NULL,
	COMM_ORDER	    NUMBER	NOT NULL,
	RECOM_NUM	    NUMBER	DEFAULT '0' NOT NULL,
	BEG_DATE	    TIMESTAMP DEFAULT SYSDATE NOT NULL,
	MOD_DATE	    TIMESTAMP DEFAULT SYSDATE NOT NULL,
	MOD_YN	        CHAR(1)	DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	DEL_YN	        CHAR(1)	DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_COMMENT_M PRIMARY KEY(COMM_NO),
    CONSTRAINT FK_TB_COMMENT_M FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_MAGAZINE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_MAGAZINE
);

--매거진 댓글 코멘트
COMMENT ON COLUMN TB_COMMENT_M.COMM_NO IS '댓글번호';
COMMENT ON COLUMN TB_COMMENT_M.POST_NO IS '메거진 게시글번호';
COMMENT ON COLUMN TB_COMMENT_M.USER_NO IS '회원번호';
COMMENT ON COLUMN TB_COMMENT_M.COMM_CONTENT IS '댓글내용';
COMMENT ON COLUMN TB_COMMENT_M.COMM_ORDER IS '댓글순서';
COMMENT ON COLUMN TB_COMMENT_M.RECOM_NUM IS '추천수';
COMMENT ON COLUMN TB_COMMENT_M.BEG_DATE IS '작성일';
COMMENT ON COLUMN TB_COMMENT_M.MOD_DATE IS '수정일';
COMMENT ON COLUMN TB_COMMENT_M.MOD_YN IS '수정여부';
COMMENT ON COLUMN TB_COMMENT_M.DEL_YN IS '삭제여부';

DROP SEQUENCE SEQ_MAG_CNO;
CREATE SEQUENCE SEQ_MAG_CNO;
DROP SEQUENCE SEQ_MAG_CNO_CNO;
CREATE SEQUENCE SEQ_MAG_CNO_CNO;


-------------------------------------메거진 대댓글
DROP TABLE TB_COMMENT_M2;
CREATE TABLE TB_COMMENT_M2 (
    COMM_NO NUMBER NOT NULL,
    POST_NO NUMBER NOT NULL,
    USER_NO NUMBER NOT NULL,
	COMM_CONTENT	VARCHAR2(4000)	NOT NULL,
	COMM_ORDER	NUMBER	    NOT NULL,
	RECOM_NUM	NUMBER	    DEFAULT '0' NOT NULL,
	BEG_DATE	TIMESTAMP   DEFAULT SYSDATE	NOT NULL,
	MOD_DATE	TIMESTAMP	DEFAULT SYSDATE NOT NULL,
	MOD_YN	    CHAR(1)	    DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	DEL_YN	    CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT FK_TB_COMMENT_M2 FOREIGN KEY(COMM_NO)
    REFERENCES TB_COMMENT_M(COMM_NO),
    FOREIGN KEY (POST_NO) REFERENCES TB_COMMENT_M,
    FOREIGN KEY (USER_NO) REFERENCES TB_COMMENT_M
);

--매거진 대댓글 코멘트
COMMENT ON COLUMN TB_COMMENT_M2.COMM_NO IS '댓글번호';
COMMENT ON COLUMN TB_COMMENT_M2.POST_NO IS '메거진 게시글번호';
COMMENT ON COLUMN TB_COMMENT_M2.USER_NO IS '회원번호';
COMMENT ON COLUMN TB_COMMENT_M2.COMM_CONTENT IS '댓글내용';
COMMENT ON COLUMN TB_COMMENT_M2.COMM_ORDER IS '댓글순서';
COMMENT ON COLUMN TB_COMMENT_M2.RECOM_NUM IS '추천수';
COMMENT ON COLUMN TB_COMMENT_M2.BEG_DATE IS '작성일';
COMMENT ON COLUMN TB_COMMENT_M2.MOD_DATE IS '수정일';
COMMENT ON COLUMN TB_COMMENT_M2.MOD_YN IS '수정여부';
COMMENT ON COLUMN TB_COMMENT_M2.DEL_YN IS '삭제여부';


--매거진 첨부파일관리 테이블 생성
DROP TABLE TB_ATTACHED_FILE_M;
CREATE TABLE TB_ATTACHED_FILE_M (
	FILE_NO	        NUMBER	        NOT NULL,
	POST_NO     	NUMBER	        NOT NULL,
	USER_NO	        NUMBER	        NOT NULL,
	FILE_NAME	    VARCHAR2(255)	DEFAULT '' NOT NULL,
	MFILE_NAME	    VARCHAR2(255)	DEFAULT '' NOT NULL,
    CONSTRAINT PK_TB_ATTACHED_FILE_M PRIMARY KEY(FILE_NO),
    CONSTRAINT FK_TB_ATTACHED_FILE_M FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_MAGAZINE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_MAGAZINE
)
;

--매거진 첨부파일 코멘트
COMMENT ON COLUMN TB_ATTACHED_FILE_M.FILE_NO IS '파일번호';
COMMENT ON COLUMN TB_ATTACHED_FILE_M.POST_NO IS '메거진 게시글번호';
COMMENT ON COLUMN TB_ATTACHED_FILE_M.USER_NO IS '회원번호';
COMMENT ON COLUMN TB_ATTACHED_FILE_M.FILE_NAME IS '파일명';
COMMENT ON COLUMN TB_ATTACHED_FILE_M.MFILE_NAME IS '업로드 후 파일명';

--매거진 첨부파일번호 시퀀스
DROP SEQUENCE SEQ_MAG_FNO;
CREATE SEQUENCE SEQ_MAG_FNO;


------------------------매거진 스크랩
DROP TABLE TB_SCRAP_M;

CREATE TABLE TB_SCRAP_M (
	SCRAP_NO	    NUMBER	    NOT NULL,
	USER_NO	        NUMBER	    NOT NULL,
	POST_NO	        NUMBER	    NOT NULL,
	USER_NO2     	NUMBER	    NOT NULL,
	SCARP_DATE	    TIMESTAMP	DEFAULT SYSDATE NOT NULL,
	DEL_YN	        CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_SCRAP_M PRIMARY KEY(SCRAP_NO),
    CONSTRAINT FK_TB_SCRAP_M FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_MAGAZINE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_MAGAZINE
);

ALTER TABLE TB_SCRAP_M ADD CONSTRAINT FK_TB_USER_TO_TB_SCRAP_M_1 FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

--메거진 스크랩 코멘트
COMMENT ON COLUMN TB_SCRAP_M.SCRAP_NO IS '스크랩번호';
COMMENT ON COLUMN TB_SCRAP_M.USER_NO IS '스크랩한 게시물 작성 회원번호';
COMMENT ON COLUMN TB_SCRAP_M.POST_NO IS '매거진글번호';
COMMENT ON COLUMN TB_SCRAP_M.USER_NO2 IS '스크랩한 회원 번호';
COMMENT ON COLUMN TB_SCRAP_M.SCARP_DATE IS '스크랩일';
COMMENT ON COLUMN TB_SCRAP_M.DEL_YN IS '삭제여부';

--매거진 스크랩 시퀀스
DROP SEQUENCE SEQ_MAG_SNO;
CREATE SEQUENCE SEQ_MAG_SNO;


---------------------매거진 게시글 추천
DROP TABLE TB_RECOMMEND_M;
CREATE TABLE TB_RECOMMEND_M (
	RECOM_NO	    NUMBER		NOT NULL,
	POST_NO	        NUMBER		NOT NULL,
	USER_NO	        NUMBER		NOT NULL,
	RECOM_DATE	    TIMESTAMP   DEFAULT SYSDATE NOT NULL,
	DEL_YN	        CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
	USER_NO2	    NUMBER		NOT NULL,
    CONSTRAINT PK_TB_RECOMMEND_M PRIMARY KEY(RECOM_NO),
    CONSTRAINT FK_TB_RECOMMEND_M FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_MAGAZINE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_MAGAZINE
);

ALTER TABLE TB_RECOMMEND_M ADD CONSTRAINT FK_TB_USER_TO_TB_RECOMMEND_M FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

--메거진 게시글 추천 코멘트
COMMENT ON COLUMN TB_RECOMMEND_M.RECOM_NO IS '추천번호';
COMMENT ON COLUMN TB_RECOMMEND_M.POST_NO IS '매거진 게시글번호';
COMMENT ON COLUMN TB_RECOMMEND_M.USER_NO IS '추천 당한 회원번호';
COMMENT ON COLUMN TB_RECOMMEND_M.RECOM_DATE IS '추천일';
COMMENT ON COLUMN TB_RECOMMEND_M.DEL_YN IS '삭제여부';
COMMENT ON COLUMN TB_RECOMMEND_M.USER_NO2 IS '추천한 회원번호';

--매거진 게시글 추천 시퀀스
DROP SEQUENCE SEQ_MAG_RNO;
CREATE SEQUENCE SEQ_MAG_RNO;


---------------------------------메거진 댓글 추천
DROP TABLE TB_RECOMMEND_COMMENT_M;

CREATE TABLE TB_RECOMMEND_COMMENT_M (
	RECOM_NO	NUMBER		NOT NULL,
	COMM_NO	    NUMBER		NOT NULL,
	POST_NO	    NUMBER		NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
	RECOM_DATE	TIMESTAMP   DEFAULT SYSDATE NOT NULL,
	DEL_YN	    CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
	USER_NO2	NUMBER		NOT NULL,
    CONSTRAINT PK_TB_RECOMMEND_COMMENT_M PRIMARY KEY(RECOM_NO),
    CONSTRAINT FK_TB_RECOMMEND_COMMENT_M FOREIGN KEY(COMM_NO)
    REFERENCES TB_COMMENT_M(COMM_NO),
    FOREIGN KEY (POST_NO) REFERENCES TB_COMMENT_M,
    FOREIGN KEY (USER_NO) REFERENCES TB_COMMENT_M
);

ALTER TABLE TB_RECOMMEND_COMMENT_M
ADD CONSTRAINT USER_NO2 FOREIGN KEY(USER_NO2) REFERENCES TB_USER(USER_NO);

--메거진 게시글 댓글 추천 코멘트
COMMENT ON COLUMN TB_RECOMMEND_COMMENT_M.RECOM_NO IS '추천번호';
COMMENT ON COLUMN TB_RECOMMEND_COMMENT_M.COMM_NO IS '댓글번호';
COMMENT ON COLUMN TB_RECOMMEND_COMMENT_M.POST_NO IS '매거진 게시글번호';
COMMENT ON COLUMN TB_RECOMMEND_COMMENT_M.USER_NO IS '추천 당한 회원번호';
COMMENT ON COLUMN TB_RECOMMEND_COMMENT_M.RECOM_DATE IS '추천일';
COMMENT ON COLUMN TB_RECOMMEND_COMMENT_M.DEL_YN IS '삭제여부';
COMMENT ON COLUMN TB_RECOMMEND_COMMENT_M.USER_NO2 IS '추천한 회원번호';

--매거진 게시글 댓글 추천 시퀀스
DROP SEQUENCE SEQ_MAG_RCNO;
CREATE SEQUENCE SEQ_MAG_RCNO;


------------------------------------매거진 신고관리 테이블
DROP TABLE MAG_REPORT;

CREATE TABLE MAG_REPORT (
	REPORT_NO	NUMBER		NOT NULL,
	POST_NO	    NUMBER		NOT NULL,
	COMM_NO	    NUMBER,
	USER_NO2	NUMBER		NOT NULL,
	REPORT_DATE	TIMESTAMP	DEFAULT SYSDATE	NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
    CONSTRAINT PK_MAG_REPORT PRIMARY KEY(REPORT_NO),
    CONSTRAINT FK_MAG_REPORT FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_MAGAZINE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_MAGAZINE
);

ALTER TABLE MAG_REPORT ADD CONSTRAINT FK_TB_USER_TO_MAG_REPORT FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

ALTER TABLE MAG_REPORT ADD CONSTRAINT FK_TB_COMMENT_M_TO_MAG_REPORT FOREIGN KEY (COMM_NO)
REFERENCES TB_COMMENT_M (COMM_NO);

--매거진 신고관리 코멘트
COMMENT ON COLUMN MAG_REPORT.REPORT_NO IS '신고접수번호';
COMMENT ON COLUMN MAG_REPORT.POST_NO IS '매거진글번호';
COMMENT ON COLUMN MAG_REPORT.USER_NO IS '신고 당한 회원번호';
COMMENT ON COLUMN MAG_REPORT.REPORT_DATE IS '접수일';
COMMENT ON COLUMN MAG_REPORT.USER_NO2 IS '신고한 회원번호';
COMMENT ON COLUMN MAG_REPORT.COMM_NO IS '댓글번호';

--매거진 신고관리 시퀀스
--SEQ_REPORT



---------------------------------챌린지---------------------------------
--챌린지 게시글 테이블
DROP TABLE TB_BOARD_CHALLENGE;
CREATE TABLE TB_BOARD_CHALLENGE (
	POST_NO	NUMBER		NOT NULL,
	USER_NO	NUMBER		NOT NULL,
	POST_NAME	VARCHAR2(30)		NOT NULL,
	POST_CONTENT	VARCHAR2(4000)		NOT NULL,
	BEG_DATE	TIMESTAMP	DEFAULT SYSDATE	NOT NULL,
	CHALLENGE_PERIOD	TIMESTAMP,
	PARTI_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	SCRAP_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	HITS	NUMBER	DEFAULT '0'	NOT NULL,
	COMM_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	REVIEW_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	THUMBNAIL	VARCHAR2(100),
	MOD_YN	CHAR(1)	DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	FMOD_DATE	TIMESTAMP   DEFAULT SYSDATE,
	DEL_YN	CHAR(1)	DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_BOARD_CHALLENGE PRIMARY KEY(POST_NO),
    CONSTRAINT FK_TB_BOARD_CHALLENGE FOREIGN KEY(USER_NO)
    REFERENCES TB_USER(USER_NO)
);

DROP SEQUENCE SEQ_CHA_PNO;
CREATE SEQUENCE SEQ_CHA_PNO;

--챌린지 댓글 테이블 생성
DROP TABLE TB_COMMENT_C;
CREATE TABLE TB_COMMENT_C (
	COMM_NO	        NUMBER	NOT NULL,
	POST_NO	        NUMBER	NOT NULL,
	USER_NO	        NUMBER	NOT NULL,
	COMM_CONTENT	VARCHAR2(4000)	NOT NULL,
	COMM_ORDER	    NUMBER	NOT NULL,
	RECOM_NUM	    NUMBER	DEFAULT '0' NOT NULL,
	BEG_DATE	    TIMESTAMP DEFAULT SYSDATE NOT NULL,
	MOD_DATE	    TIMESTAMP DEFAULT SYSDATE NOT NULL,
	MOD_YN	        CHAR(1)	DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	DEL_YN	        CHAR(1)	DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_COMMENT_C PRIMARY KEY(COMM_NO),
    CONSTRAINT FK_TB_COMMENT_C FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_CHALLENGE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_CHALLENGE
);

DROP SEQUENCE SEQ_CHA_CNO;
CREATE SEQUENCE SEQ_CHA_CNO;

--챌린지 대댓글 테이블 생성
DROP TABLE TB_COMMENT_C2;
CREATE TABLE TB_COMMENT_C2 (
	COMM_NO NUMBER NOT NULL,
    POST_NO NUMBER NOT NULL,
    USER_NO NUMBER NOT NULL,
	COMM_CONTENT	VARCHAR2(4000)	NOT NULL,
	COMM_ORDER	NUMBER	    NOT NULL,
	RECOM_NUM	NUMBER	    DEFAULT '0' NOT NULL,
	BEG_DATE	TIMESTAMP   DEFAULT SYSDATE	NOT NULL,
	MOD_DATE	TIMESTAMP	DEFAULT SYSDATE NOT NULL,
	MOD_YN	    CHAR(1)	    DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	DEL_YN	    CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT FK_TB_COMMENT_C2 FOREIGN KEY(COMM_NO)
    REFERENCES TB_COMMENT_C(COMM_NO),
    FOREIGN KEY (POST_NO) REFERENCES TB_COMMENT_C,
    FOREIGN KEY (USER_NO) REFERENCES TB_COMMENT_C
);

--챌린지 첨부파일 테이블 생성
DROP TABLE TB_ATTACHED_FILE_C;
CREATE TABLE TB_ATTACHED_FILE_C (
	FILE_NO	        NUMBER	        NOT NULL,
	POST_NO     	NUMBER	        NOT NULL,
	USER_NO	        NUMBER	        NOT NULL,
	FILE_NAME	    VARCHAR2(255)	DEFAULT '' NOT NULL,
	MFILE_NAME	    VARCHAR2(255)	DEFAULT '' NOT NULL,
    CONSTRAINT PK_TB_ATTACHED_FILE_C PRIMARY KEY(FILE_NO),
    CONSTRAINT FK_TB_ATTACHED_FILE_C FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_CHALLENGE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_CHALLENGE
);

DROP SEQUENCE SEQ_CHA_FNO;
CREATE SEQUENCE SEQ_CHA_FNO;

--챌린지 스크랩 테이블 생성
DROP TABLE TB_SCRAP_C;

CREATE TABLE TB_SCRAP_C (
	SCRAP_NO	    NUMBER	    NOT NULL,
	USER_NO	        NUMBER	    NOT NULL,
	POST_NO	        NUMBER	    NOT NULL,
	USER_NO2     	NUMBER	    NOT NULL,
	SCARP_DATE	    TIMESTAMP	DEFAULT SYSDATE NOT NULL,
	DEL_YN	        CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_SCRAP_C PRIMARY KEY(SCRAP_NO),
    CONSTRAINT FK_TB_SCRAP_C FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_CHALLENGE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_CHALLENGE
);
ALTER TABLE TB_SCRAP_C ADD CONSTRAINT FK_TB_USER_TO_TB_SCRAP_C_1 FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

DROP SEQUENCE SEQ_CHA_SNO;
CREATE SEQUENCE SEQ_CHA_SNO;

--챌린지 게시글 참가 테이블
DROP TABLE TB_PARTICIPATE_C;

CREATE TABLE TB_PARTICIPATE_C (
	PARTI_NO	NUMBER		NOT NULL,
	POST_NO	    NUMBER		NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
	PARTI_DATE	TIMESTAMP	DEFAULT SYSDATE	NOT NULL,
	STOP_YN	CHAR(1)	DEFAULT 'N' CHECK(STOP_YN IN('Y', 'N')),
    USER_NO2    NUMBER	    NOT NULL,
    CONSTRAINT PK_TB_PARTICIPATE_C PRIMARY KEY(PARTI_NO),
    CONSTRAINT FK_TB_PARTICIPATE_C FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_CHALLENGE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_CHALLENGE
);

ALTER TABLE TB_PARTICIPATE_C ADD CONSTRAINT FK_TB_USER_TO_TB_PARTICIPATE_C FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

DROP SEQUENCE SEQ_CHA_PARNO;
CREATE SEQUENCE SEQ_CHA_PARNO;

--챌린지 댓글 추천
DROP TABLE TB_RECOMMEND_COMMENT_C;

CREATE TABLE TB_RECOMMEND_COMMENT_C (
	RECOM_NO	NUMBER		NOT NULL,
	COMM_NO	    NUMBER		NOT NULL,
	POST_NO	    NUMBER		NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
	RECOM_DATE	TIMESTAMP	DEFAULT SYSDATE	NOT NULL,
	DEL_YN	CHAR(1)	DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    USER_NO2    NUMBER	    NOT NULL,
    CONSTRAINT PK_TB_RECOMMEND_COMMENT_C PRIMARY KEY(RECOM_NO),
    CONSTRAINT FK_TB_RECOMMEND_COMMENT_C FOREIGN KEY(COMM_NO)
    REFERENCES TB_COMMENT_C(COMM_NO),
    FOREIGN KEY (POST_NO) REFERENCES TB_COMMENT_C,
    FOREIGN KEY (USER_NO) REFERENCES TB_COMMENT_C
);

ALTER TABLE TB_RECOMMEND_COMMENT_C
ADD CONSTRAINT USER_NO2 FOREIGN KEY(USER_NO2) REFERENCES TB_USER(USER_NO);

DROP SEQUENCE SEQ_CHA_RCNO;
CREATE SEQUENCE SEQ_CHA_RCNO;

--챌린지 신고 관리 테이블
DROP TABLE CHA_REPORT;

CREATE TABLE CHA_REPORT (
	REPORT_NO	NUMBER		NOT NULL,
	POST_NO	    NUMBER		NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
	REPORT_DATE	TIMESTAMP	DEFAULT SYSDATE	NOT NULL,
	COMM_NO	    NUMBER		NOT NULL,
	USER_NO2	NUMBER		NOT NULL,
    CONSTRAINT PK_CHA_REPORT PRIMARY KEY(REPORT_NO),
    CONSTRAINT FK_CHA_REPORT FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_CHALLENGE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_CHALLENGE
);

ALTER TABLE CHA_REPORT ADD CONSTRAINT FK_TB_USER_TO_CHA_REPORT FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

ALTER TABLE CHA_REPORT ADD CONSTRAINT FK_TB_COMMENT_C_TO_CHA_REPORT FOREIGN KEY (COMM_NO)
REFERENCES TB_COMMENT_C (COMM_NO);

--챌린지 신고관리 시퀀스
--SEQ_REPORT



--------------------------------레시피-------------------------------------
--레시피 게시글
DROP TABLE TB_BOARD_RECEIPT;
DROP TABLE TB_BOARD_RECIPE;
CREATE TABLE TB_BOARD_RECIPE (
	POST_NO	    NUMBER		NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
	POST_NAME	VARCHAR2(30)		NOT NULL,
	POST_CONTENT	VARCHAR2(4000)		NULL,
	BEG_DATE	TIMESTAMP	DEFAULT SYSDATE	NULL,
	HITS	    NUMBER	DEFAULT '0',
	RECOM_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	SCRAP_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	COMM_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	REVIEW_NUM	NUMBER	DEFAULT '0'	NOT NULL,
	DIFFICULTY	VARCHAR2(10),
	REQ_TIME	VARCHAR2(10),
	CATEGORY	VARCHAR2(20),
	TAG	VARCHAR2(20),
	THUMBNAIL	VARCHAR2(100),
	MOD_YN	CHAR(1)	DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	DEL_YN	CHAR(1)	DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
	FMOD_DATE	TIMESTAMP,
    CONSTRAINT PK_TB_BOARD_RECIPE PRIMARY KEY(POST_NO),
    CONSTRAINT FK_TB_BOARD_RECIPE FOREIGN KEY(USER_NO)
    REFERENCES TB_USER(USER_NO)
);

DROP SEQUENCE SEQ_REC_RNO;
CREATE SEQUENCE SEQ_REC_RNO;

--레시피 댓글
DROP TABLE TB_COMMNET_R;
CREATE TABLE TB_COMMNET_R (
	COMM_NO	        NUMBER	NOT NULL,
	POST_NO	        NUMBER	NOT NULL,
	USER_NO	        NUMBER	NOT NULL,
	COMM_CONTENT	VARCHAR2(4000)	NOT NULL,
	COMM_ORDER	    NUMBER	NOT NULL,
	RECOM_NUM	    NUMBER	DEFAULT '0' NOT NULL,
	BEG_DATE	    TIMESTAMP DEFAULT SYSDATE NOT NULL,
	MOD_DATE	    TIMESTAMP DEFAULT SYSDATE NOT NULL,
	MOD_YN	        CHAR(1)	DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	DEL_YN	        CHAR(1)	DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_COMMENT_R PRIMARY KEY(COMM_NO,POST_NO,USER_NO),
    CONSTRAINT FK_TB_COMMENT_R FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_RECIPE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_RECIPE
);

DROP SEQUENCE SEQ_REC_CNO;
CREATE SEQUENCE SEQ_REC_CNO;

--레시피 대댓글
DROP TABLE TB_COMMENT_R2;

CREATE TABLE TB_COMMENT_R2 (
	COMM_NO         NUMBER NOT NULL,
    POST_NO         NUMBER NOT NULL,
    USER_NO         NUMBER NOT NULL,
	COMM_CONTENT	VARCHAR2(4000)	NOT NULL,
	COMM_ORDER	    NUMBER	    NOT NULL,
	RECOM_NUM	    NUMBER	    DEFAULT '0' NOT NULL,
	BEG_DATE	    TIMESTAMP   DEFAULT SYSDATE	NOT NULL,
	MOD_DATE	    TIMESTAMP	DEFAULT SYSDATE NOT NULL,
	MOD_YN	        CHAR(1)	    DEFAULT 'N' CHECK(MOD_YN IN('Y', 'N')),
	DEL_YN	        CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N'))
);
ALTER TABLE TB_COMMENT_R2
ADD CONSTRAINT FK_COMMENT_R2
FOREIGN KEY (COMM_NO, POST_NO, USER_NO)
REFERENCES TB_COMMENT_R (COMM_NO, POST_NO, USER_NO);

--레시피 첨부파일
DROP TABLE TB_ATTACHED_FILE_R;

CREATE TABLE TB_ATTACHED_FILE_R (
	FILE_NO	        NUMBER	        NOT NULL,
	POST_NO     	NUMBER	        NOT NULL,
	USER_NO	        NUMBER	        NOT NULL,
	FILE_NAME	    VARCHAR2(255)	DEFAULT '' NOT NULL,
	MFILE_NAME	    VARCHAR2(255)	DEFAULT '' NOT NULL,
    CONSTRAINT PK_TB_ATTACHED_FILE_R PRIMARY KEY(FILE_NO),
    CONSTRAINT FK_TB_ATTACHED_FILE_R FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_RECIPE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_RECIPE
);

DROP SEQUENCE SEQ_REC_FNO;
CREATE SEQUENCE SEQ_REC_FNO;

--레시피 스크랩
DROP TABLE TB_SCRAP_R;
CREATE TABLE TB_SCRAP_R (
	SCRAP_NO	    NUMBER	    NOT NULL,
	USER_NO	        NUMBER	    NOT NULL,
	POST_NO	        NUMBER	    NOT NULL,
	USER_NO2     	NUMBER	    NOT NULL,
	SCARP_DATE	    TIMESTAMP	DEFAULT SYSDATE NOT NULL,
	DEL_YN	        CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
    CONSTRAINT PK_TB_SCRAP_R PRIMARY KEY(SCRAP_NO),
    CONSTRAINT FK_TB_SCRAP_R FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_RECIPE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_RECIPE
);
ALTER TABLE TB_SCRAP_R ADD CONSTRAINT FK_TB_USER_TO_TB_SCRAP_R_1 FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

DROP SEQUENCE SEQ_REC_SNO;
CREATE SEQUENCE SEQ_REC_SNO;

--레시피 게시글 추천
DROP TABLE TB_RECOMMEND_R;

CREATE TABLE TB_RECOMMEND_R (
	RECOM_NO	    NUMBER		NOT NULL,
	POST_NO	        NUMBER		NOT NULL,
	USER_NO	        NUMBER		NOT NULL,
	RECOM_DATE	    TIMESTAMP   DEFAULT SYSDATE NOT NULL,
	DEL_YN	        CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
	USER_NO2	    NUMBER		NOT NULL,
    CONSTRAINT PK_TB_RECOMMEND_R PRIMARY KEY(RECOM_NO),
    CONSTRAINT FK_TB_RECOMMEND_R FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_RECIPE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_RECIPE
);

ALTER TABLE TB_RECOMMEND_R ADD CONSTRAINT FK_TB_USER_TO_TB_RECOMMEND_R FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

DROP SEQUENCE SEQ_REC_RNO;
CREATE SEQUENCE SEQ_REC_RNO;

--레시피 댓글 추천
DROP TABLE TB_RECOMMEND_COMMENT_R;
CREATE TABLE TB_RECOMMEND_COMMENT_R (
	RECOM_NO	NUMBER		NOT NULL,
	COMM_NO	    NUMBER		NOT NULL,
	POST_NO	    NUMBER		NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
	RECOM_DATE	TIMESTAMP   DEFAULT SYSDATE NOT NULL,
	DEL_YN	    CHAR(1)	    DEFAULT 'N' CHECK(DEL_YN IN('Y', 'N')),
	USER_NO2	NUMBER		NOT NULL,
    CONSTRAINT PK_TB_RECOMMEND_COMMENT_R PRIMARY KEY(RECOM_NO)
    --CONSTRAINT FK_TB_RECOMMEND_COMMENT_R FOREIGN KEY(COMM_NO) --외래키 아직 못함 왜인지 안들어가
   -- REFERENCES TB_COMMENT_R(COMM_NO)
    --FOREIGN KEY (POST_NO) REFERENCES TB_COMMENT_R,
   -- FOREIGN KEY (USER_NO) REFERENCES TB_COMMENT_R
);

ALTER TABLE TB_RECOMMEND_COMMENT_R
ADD CONSTRAINT USER_NO2 FOREIGN KEY(USER_NO2) REFERENCES TB_USER(USER_NO);

--레시피 신고 관리
DROP TABLE REC_REPORT;

CREATE TABLE REC_REPORT (
	REPORT_NO	NUMBER		NOT NULL,
	POST_NO	    NUMBER		NOT NULL,
	USER_NO	    NUMBER		NOT NULL,
	REPORT_DATE	TIMESTAMP	DEFAULT SYSDATE	NOT NULL,
	COMM_NO	    NUMBER		NOT NULL,
	USER_NO2	NUMBER		NOT NULL,
    CONSTRAINT PK_REC_REPORT PRIMARY KEY(REPORT_NO),
    CONSTRAINT FK_REC_REPORT FOREIGN KEY(POST_NO)
    REFERENCES TB_BOARD_RECIPE(POST_NO),
    FOREIGN KEY (USER_NO) REFERENCES TB_BOARD_RECIPE
);

ALTER TABLE REC_REPORT ADD CONSTRAINT FK_TB_USER_TO_REC_REPORT FOREIGN KEY (USER_NO2)
REFERENCES TB_USER (USER_NO);

--ALTER TABLE REC_REPORT ADD CONSTRAINT FK_TB_COMMENT_R_TO_REC_REPORT FOREIGN KEY (COMM_NO) 제약조건이 안걸림 내가보니 COMM_NO 이녀석이 문제다.
--REFERENCES TB_COMMENT_R (COMM_NO);






COMMIT;



