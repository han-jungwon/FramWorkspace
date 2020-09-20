package com.kh.board.model.service;

import java.util.ArrayList;

import com.kh.board.model.vo.Board;
import com.kh.board.model.vo.PageInfo;
import com.kh.board.model.vo.SearchCondition;

public interface BoardService {

		// 1_1. 게시판 목록 수 조회용 메소드
		int getListCount();
		
		// 1_2. 페이징 처리 된 게시판 목록 조회용 메소드
		ArrayList<Board> selectBoardList(PageInfo pi);
		
		// 2. 게시물 상세보기용 메소드
		Board selectBoardDetail(int bId);
		
		// 3_1. 검색된 게시판 목록 수 조회용 메소드
		int getSearchResultListCount(SearchCondition sc);
		
		// 3_2. 검색된 게시판 목록들 조회용 메소드
		ArrayList<Board> selectSearchResultList(SearchCondition sc, PageInfo pi);
		
		
		
		

}
