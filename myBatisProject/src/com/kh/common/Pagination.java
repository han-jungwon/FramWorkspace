package com.kh.common;

import com.kh.board.model.vo.PageInfo;

public class Pagination {
	public static PageInfo getPageInfo(int currentPage, int listCount) {
		// 페이지 정보를 담아줄 PageInfo 참조변수 선언
		PageInfo pi = null;
		
		int pageLimit = 10;		// 한 페이지에서 보여질 페이징 수 
		int maxPage;			// 전체 페이징 수 가장 마지막 페이지
		int startPage;			// 현재 페이지에서 보여질 페이징 버튼의 시작 페이지
		int endPage;			// 현재 페이지에서 보여질 페이징 버튼의 끝 페이지
		
		int boardLimit = 5; 	// 한 페이지에서 보여질 게시글 갯수
		
		// * maxPage :  총 페이지 수
		maxPage = (int)Math.ceil((double)listCount/ boardLimit);
		
		
		// * startPage : 현재 페이지에서 보여질 페이징 버튼의 시작  페이지
		startPage = (currentPage-1)/pageLimit * pageLimit + 1;
				// 현재 currentPage의 자료형이 int형태이므로 pageLimit로 나누면 0.X가  되는데
				// int형태이므로 소수점이하가 제거 되어  0이된다.
				// 고로 currentPage가 2라고 가정하며
				// (2 -1)/10 * 10 +1'
				// 1/10 * 10 + 1; --> 0.1[int이므로 소수점이 제거] * 10 + 1;
				//					--> 0 * 10 + 1
				// 						--> 0 + 1
				//							--> 1
		
		// * endPage : 현재 페이지에서 보여질 페이징 버튼의 끝 페이지 수
		endPage = startPage + pageLimit -1;
		
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		pi = new PageInfo(currentPage,listCount,pageLimit,maxPage,startPage,endPage,boardLimit);
		return pi;
	}
	
	
}
