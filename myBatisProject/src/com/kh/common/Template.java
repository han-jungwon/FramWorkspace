package com.kh.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	
	public static SqlSession getSqlSession() {
		// sqlSession 객체를 반환하기 위한 변수 선언
		SqlSession session = null;
		
		InputStream stream;
		
		try {
			stream = Resources.getResourceAsStream("/mybatis-config.xml");
			
			
			// SqlSession을 만들기 위해서는 SqlSessionFactory에서 openSession이라는 것을 해줘야 한다.
			// SqlSessionFactory는 SqlSessionFactoryBuilder라는 클래스의 build()를 통해서 생성이 된다.
			// openSession(false)의 의미는 자동 커밋을 하지 않게 설정하는 것이다.
			session = new SqlSessionFactoryBuilder().build(stream).openSession(false);
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	
	return session;

}
	
	// commit(),rollback(),close() 함수는 만들지 않는다.
	// 왜냐하면 SqlSession 클래스가 commit,rollback,close 함수를 제공해주고
	// Statement관련, ResultSet관련한 close부분은 사용 안함.
}