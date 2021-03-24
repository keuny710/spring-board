package com.spring.board2.persistence;

import com.spring.board2.domain.ImageVO;

public interface Dao {
	
	public ImageVO readImageAtDao(int date);

}
