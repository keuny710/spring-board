package com.spring.board2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board2.domain.ImageVO;
import com.spring.board2.persistence.Dao;
import com.spring.board2.persistence.Daoimpl;

@Service
public class DownloadService {
	
	@Autowired
	private Dao imgDAO;
	
	public ImageVO readImage(int date) {
		
		return imgDAO.readImageAtDao(date);
	}
}
