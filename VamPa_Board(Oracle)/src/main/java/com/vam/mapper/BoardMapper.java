package com.vam.mapper;

import java.util.List;

import com.vam.model.BoardVO;
import com.vam.model.Criteria;

public interface BoardMapper {

	 /* 글 등록 */
    public void enroll(BoardVO board);
    
    /* 게시글 목록 */
    public List<BoardVO> getList();
    
    /* 게시글 조회 */
    public BoardVO getPage(int bno);
    
    /* 게시글 수정 */
    public int modify(BoardVO board);
    
    /* 게시글 삭제 */
    public int delete(int bno);
    
    /* 게시판 목록(페이징 적용) */
    public List<BoardVO> getListPaging(Criteria cri);
    // 함수 이름 : getListPaging
    // 이 함수가 실행될때 필요한 데이터가 하나 있는데 그놈의 데이터 타입이 Criteria야 한다.
    // 그 전달된 참조형 변수를 이 함수 안에서는 cri라는 이름으로 쓸거다.
    // 이 함수가 실행되고 나면 BoardVO로 구성된 리스트를 반환 할거다.
    // 위의 함수 정의에 대한 약속.
    
    /* 게시판 총 갯수 */
    public int getTotal(Criteria cri);
    
}
