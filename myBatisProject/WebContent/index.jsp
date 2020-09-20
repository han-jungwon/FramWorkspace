<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <!-- 
      * 프레임 워크
      - 개발자가 보다 편리한 환경에서 개발할 수 있도록 제공하는 툴, 뼈대라고 생각하자
      - 사전적 정의로 '복잡한 문제를 해결하거나 서술하는데 사용하는 기본 개념 구조'
      - 소프트웨어 개발의 입자으로써는 공통으로 사용하는 라이브러리/ 개발도구/인터페이스 등등을 의미
      
      * 왜 프레임워크를 쓰는가
      - 웹프로그래밍의 추세는 엄청난 규모의 프로잭트가 많다.
       그렇게 거대하고 복잡도가 높은 프로잭트를 하기 위해서는 많은 사람들이 필요하게 되고
        그 개발자들이 '통일성'있게 '빠르고' '안정적'으로 개발하기 위해 프레임워크로 좋은 성과를 낼수 있다.-> 생산성 향상
        
        -> 자유롭게 설계하고 코딩하는것이 아니라 프레임워크가 제공하는 가이드 대로 설계하고 코딩을 하게 된다.
        -> 개발자를 위한 다양한 도구들이 지원
        -> 개발할 수 있는 범위가 정해져있다.
        -> 개발자들이 따라야하는 가이드라인을 제공한다.
        
        
        * 프레임워크의 장점
        - 개발 시간을 줄일 수 있다.
        - 오류로 부터 자유로울 수 있다.
       * 프레임워크의 단점
       - 프레임워크에 너무 의존하면 개발자들의 능력이 떨어져서 프레임 워크없이 개발하는것이 어려워진다.
       
       
       * 프레임워크 종류
       - 영속성: 데이터 관련한(CRUD) 기능들을 보다 편리하게 작업할 수있도록 제공해주는 프레임워크ex) myBatis
       - 자바 : 웹 애플리케이션에 초점을 맞춰 필요한 요소들을 모듈화해서 제공해주는 프레임워크ex) spring
       - 화면구현: Front-End를 보다 쉽게 구현할 수 있게 틀을 제공하는 프레임워크ex) Bootstrap
       - 기능 및 지원 : 특정 기능이나 업무 수행에 도움을 줄 수 있는 기능을 제공하는 프레임워크ex) Log4j
       
       * 마이바티스 개요
       마이바티스는 개발자가 지정한 sql, 저장 프로시저 그리고 몇 가지 고급 매핑을 지원하는 영속성 프레임워크이다.
       JDBC로 처리하는 부분의 코드와 파라미터 설정 및 결과 매핑을 대신해준다.
       DB 원시 타입과 Map인터페이스 그리고 자바 POJO를 설정해서 매핑하기 위해 XML과 어노테이션을 사용할 수있다.
       
       Apache Project에서 ibatis를 운영하던 팀이 
       2010년 5월 9일 Google팀으로 이동하면서 MyBatis로 이름을 바꿈
       기존의 ibatis의 한계점이었던 동적쿼리 및 어노테이션 처리를 보강하여 더 나은 기능 제공
       ibatis는 현재 비활성화 상태, 기존에 ibatis로 애플리케이션의 지원을 위해 라이브러리만 제공하고있다.
       
       *  ibatis vs Mybatis
       1. ibatis는 JDK 1.4이상, mybatis는 JDK 1.5이상 사용이 가능하다.
       2. 패키지 구조 변경
          - ibatis : com.ibatis.*
          - mybatis : org..apache.ibatis.*
       3. 사용 용어 변경
          - SqlMapConfig -> Configuration 
          - sqlMap -> Mapper
          - resultClass -> resultType
       4. 동적쿼리 지원
          - 쿼리문 작성 시 if,choose,trim,foreach문을 지원한다.
       5. 자바 어노테이션 지원
          
    -->
    
    <!-- 
    
             * 환경 설정
             1. workspace 세팅 고고
             2. jstl,ojdbc6 라이브러리 추가
             3. 마이바티스 사용을 위해 https:// mybatis.org/mybatis-3/ko/getting-started.html
                -> 시작하기 클릭-> mybatis-x.x.x.jar 클릭 -> github로 이동 - > 3.4.6버전 찾기
             4. Java Resources에서 new -> Source Folder 추가(name: resources)
             
             5. resources폴더 안에 mybatis-config.xml 생성
             
          * DTD : XML 문서의 구조 및 해당 문서에서 사용할 수 있는 적법한 요소와 속성을 정의
                  이 문서가 유효한지 유효성 검사도 된다.
                  
          >> DTD 설정하기
          1) Window - preferences - XML - XML catalog - User Specified Entries - Add
             - Config
               Location : http://mybatis.org/dtd/mybatis-3-config.dtd => System Id로 사용
               Key type : Public ID
               key      : -//mybatis.org//DTD Config 3.0//EN
             - Mapper 
               Location : http://mybatis.org/dtd/mybatis-3-mapper.dtd => System Id로 사용
               Key type : Public ID
               key      : -//mybatis.org//DTD Mapper 3.0//EN 
               
            >> dtd 파일로 부터 xml 파일 생성
               1) resources 오른쪽 버튼 -> Next -> XML File -> Next 
               2) Create XML file from a DTD File - Next
               3) Select XML Catalog entry - 해당 entry 선택 - 생성
               
            >> 이 성절은 이후 sqlsessionFactory 객체 생성 시 읽어가게 된다.
     -->
     <!-- ContextPath(프로잭트명) -> jsp/servlet 매번 request.getContextPath() -->
     <c:set var="contextPath" value="${ pageContext.servletContext.contextPath }" scope="application"/>
     
<%--      <a href="${ contextPath }/WEB-INF/views/main/main.jsp">메인으로</a> --%>

<!-- 
	WEB-INF 폴더는 WAS 서버가 관리하는 폴더이기 때문에 views폴더가 WEB-INF안에 있는 경우
	Web Server를 거치는 방식인 url창을 통해 접근할 수 없고
	직접 WAS 서버에 경로를 이동하는 방식인 forward를 통해서만 접근할 수 있다.
 -->
 
 	<jsp:forward page = "WEB-INF/views/main/main.jsp"/>
</body>
</html>