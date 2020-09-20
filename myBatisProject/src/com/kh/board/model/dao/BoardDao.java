package com.kh.board.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.kh.board.model.vo.Board;
import com.kh.board.model.vo.PageInfo;
import com.kh.board.model.vo.SearchCondition;

public class BoardDao {

   public int getListCount(SqlSession session) {
      int listCount = session.selectOne("boardMapper.selectListCount");
      System.out.println(listCount);
      return listCount;
   }

   public ArrayList<Board> selectBoardList(SqlSession session, PageInfo pi) {
      // 게시글 목록을 담을 변수 선언
      ArrayList<Board> list = null;
      
      // Jsp/Servlet에서는 쿼리문에서의 RowNum을 조건을 통해 조회했었다.
      // 마이바티스는 페이징 처리를 위해 RowBounds라는 클래스를 제공한다.
      // RowBounds --> offset과 limit값을 넘겨 받아 페이징 처리를 쉽게 구현할 객체
      
      // * offset = 몇 개의 게시글을 건너 뛰고 조회할 지에 대해 계산
      int offset = (pi.getCurrentPage()-1) * pi.getBoardLimit();
      
      RowBounds rowBounds = new RowBounds(offset,pi.getBoardLimit());
      
      // 리스트들을 조회하기 위해 session의 selectList()메소드를 사용
      // 메소드 사용 시 전달 인자로 3개의 값을 넘기게 되는데
      // 첫번째 인자는 쿼리문이 존재하는 '매퍼의 네임스페이스.쿼리문 아이디'
      // 두번째 인자는 조회시 필요한 데이터
      // 세번째 인자는 RowBounds 객체를 전달한다.
      
      list= (ArrayList)session.selectList("boardMapper.selectBoardList", null, rowBounds);
      //list = new ArrayList<Board>(session.selectList("boardMapper.selectBoardList", null, rowBounds));
      return list;
   }

   public int updateCount(SqlSession session, int bId) {
	   int result = session.update("boardMapper.updateBoardCount",bId);
	   
	   return result;
   }
 
   public Board selectBoardDetail(SqlSession session, int bId) {
	   // bId에 해당하는 게시글을 조회해 오는데 이때 그 해당 게시글에 달려있는 댓글들도 다 조회해 올 것이다.
	   Board b = session.selectOne("boardMapper.selectBoardDetail",bId);
	   return b;
   }

   public int getSearchResultListCount(SqlSession session, SearchCondition sc) {
		int listCount = session.selectOne("boardMapper.selectSearchResultCount",sc);
		System.out.println("listCount : " + listCount);
		return listCount;
   }

   public ArrayList<Board> selectSearchResultList(SqlSession session, SearchCondition sc, PageInfo pi) {
	   ArrayList<Board> list = null;
	   
	   int offset = (pi.getCurrentPage()-1) * pi.getBoardLimit();
	   
	   RowBounds rowBounds = new RowBounds(offset,pi.getBoardLimit());
	   
	   list = new ArrayList<Board>(session.selectList("boardMapper.selectSearchResultList",sc,rowBounds));
	   
	   return list;
   }

}