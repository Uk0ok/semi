--메거진 데이터 생성
INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,USER_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'1','맛있는 제목','맛있는 내용',default,default,default,default,
    default,default,default,default
    );


--메거진 댓글 생성
INSERT INTO TB_COMMENT_M(
    COMM_NO, POST_NO, USER_NO, COMM_CONTENT,
	COMM_ORDER, RECOM_NUM, BEG_DATE, MOD_DATE, MOD_YN, DEL_YN	
)VALUES(
    SEQ_MAG_CNO.NEXTVAL,'1','1','맛있는 댓글',
    SEQ_MAG_CNO_CNO.NEXTVAL,default,default,default,default,default
    );
    
COMMIT;
