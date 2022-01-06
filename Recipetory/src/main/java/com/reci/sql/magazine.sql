--메거진 게시판 컬럼 변경 (USER_NO -> ADMIN_NO)
ALTER TABLE TB_BOARD_MAGAZINE DROP COLUMN USER_NO;

ALTER TABLE TB_BOARD_MAGAZINE ADD(ADMIN_NO NUMBER); 

ALTER TABLE TB_BOARD_MAGAZINE ADD CONSTRAINT FK_TB_BOARD_MAGAZINE FOREIGN KEY (ADMIN_NO)
REFERENCES TB_ADMIN(ADMIN_NO);

COMMIT;

--메거진 데이터 생성
INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'한우자조금, 홈파티용 한우 레시피 소개','외부 활동이 어려운 이때 한우자조금이 한우를 활용한 작은 홈파티용 레시피를 공개해 주목되고 있다.
한우자조금 관리위원회(위원장 민경천)는 최근 홈페이지 ‘한우유명한곳’을 통해 홈파티용 한우레시피를 소개했다. 한우 앞다리살을 채썰어 육회 조리법에 따라 설탕, 소금, 후추, 간장, 다진 마늘 등으로 밑간을 한다. 여기에 트러플 오일을 고추장과 함께 넣고 버무려 주면 특별한 향의 한우육회가 완성된다.',default,default,default,default,
    default,default,default,DEFAULT,'1'
    );
    
INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'닭가슴살에 마늘... 백종원 레시피에도 없는 "치킨국"','조물주가 나를 만들 때 대체 무슨 일이 있었던 건지 깜빡하고 넣지 않은 것이 많다. 계산하는 능력, 길 찾는 법, 기계를 조작하는 법 등 많은 것을 빼먹었는데, 그중에서도 "요리 실력"은 아예 넣을 생각도 하지 않았던 게 틀림없다. 요리라는 말만 나와도 숨이 답답하고 머릿속이 캄캄해지는 것이 바로 그 이유이다.  

이런 내가 15년간, 식구들의 밥을 책임져 왔다는 것은 거의 기적에 가까운 일이자 한편으로 미안한 일이 아닐 수 없다.',default,default,default,default,
    default,default,default,DEFAULT,'2'
    );
    
    INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'외국인 입맛 잡는 고추장 "마법의 레시피"','맛보다 거의 때우기 식으로 차려내다 보니 먹는 즐거움을 제공하지 못했다. 보다 못한 남편이 얼마 전부터 주방을 책임지고 있는데 결국 답답한 놈이 우물을 판다는 말이 사실이었다.

나만의 필살기 요리, 아주 쉽습니다',default,default,default,default,
    default,default,default,DEFAULT,'1'
    );

INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'[보고서]규칙적인 식습관의 중요성','현대인들의 식습관이 무차별적이고 무자비하다',default,default,default,default,
    default,default,default,DEFAULT,'1'
    );

INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'"음식만 보여줬는데"…조리법 익혀 요리 뚝딱, 사람이 아니네','"증강현실(AR) 글라스를 착용하고 온라인 쇼핑을 하고, 인공지능(AI) 로봇이 레시피를 연구해 요리한다."

테크놀로지 업계의 새해로 불리는 소비자가전전시회(CES)가 "일상을 넘어서(Beyond the Everyday)"라는 주제로 오는 5일 미국 라스베이거스에서 성대한 막을 올린다. "일상을 넘어"라는 모토는 테크놀로지가 현실 속 깊이 파고드는 것을 뛰어넘어, 이제는 가상현실(VR)로 안내하고 있다는 의미를 담았다. 올해 CES는 그동안 주요 영역이었던 사물인터넷(IoT), 가전, 모빌리티 외에도 대체불가토큰(NFT), 메타버스, 푸드테크, 우주 기술과 같은 새로운 영역을 대거 추가했다.',default,default,default,default,
    default,default,default,DEFAULT,'1'
    );

INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'덜덜 떨면서 먹어야 제 맛.. "얼어 죽어도 포기 못해"','26일 서울 아침 최저기온이 영하 15도까지 곤두박질쳤다. 한겨울로 깊숙이 진입한 모양새다. 습관처럼 켜놓은 TV 화면에는 목도리 등으로 칭칭 감싼 차림새로 얼굴조차 분간하기 어려운 기상 캐스터가 등장해 올 겨울 들어 가장 추운 날씨를 실감나게 전하고 있었다. 덕분에 잊고 지내온 한겨울의 느낌이 온전히 되살아나는 것 같다. 이런 날에는 움직임 자체가 무척 곤혹스럽다. 일요일인 게 천만다행이다. ',default,default,default,default,
    default,default,default,DEFAULT,'1'
    );
    
    INSERT INTO TB_BOARD_MAGAZINE(
    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
)VALUES(
    SEQ_MAG_PNO.NEXTVAL,'“건강식품 ‘마’젤리로 제품화된다!”','경상북도농업기술원(생물자원연구소)은 1월 5일 안동에서‘조직감이 개선된 마 젤리 및 제조방법(출원 2021-0139517)’에 대한 특허기술을 안동와룡농협에 이전하는 협약식을 개최했다.
이를 통해 주로 생식이나 한약재로만 사용되던 마를 먹기 좋게 가공해 제품화하면 소비 확대에 도움이 될 전망이다.',default,default,default,default,
    default,default,default,DEFAULT,'1'
    );
    

commit;

--메거진 댓글 생성
--INSERT INTO TB_COMMENT_M(
--    COMM_NO, POST_NO, USER_NO, COMM_CONTENT,
--	COMM_ORDER, RECOM_NUM, BEG_DATE, MOD_DATE, MOD_YN, DEL_YN	
--)VALUES(
--    SEQ_MAG_CNO.NEXTVAL,'1','1','맛있는 댓글',
--    SEQ_MAG_CNO_CNO.NEXTVAL,default,default,default,default,default
--    );
--    
--COMMIT;
--
--INSERT INTO TB_BOARD_MAGAZINE(
--    POST_NO,POST_NAME,POST_CONTENT,BEG_DATE,
--	HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO
--)VALUES(
--    SEQ_MAG_PNO.NEXTVAL,'바바','리안',default,default,default,default,
--    default,default,default,DEFAULT,1
--    );
    


