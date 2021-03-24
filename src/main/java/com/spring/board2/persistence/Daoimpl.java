package com.spring.board2.persistence;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board2.domain.ImageVO;

@Repository
public class Daoimpl implements Dao{
//	SqlSessionTemplate sqlSessionTemplate;
	
	private static final String NAMESPACE = "com.spring.board2.mapper.imageMapper";
	
	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public ImageVO readImageAtDao(int date) {
		
		return sqlSession.selectOne(NAMESPACE+".readImage", date);
	}

}
