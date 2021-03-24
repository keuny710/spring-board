package com.spring.board2.domain;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;


@Repository
public class ImageVO {
	
	private int date;

	private MultipartFile imgFile;
	
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}

	public MultipartFile getImgFile() {
		return imgFile;
	}

	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}
	

}
