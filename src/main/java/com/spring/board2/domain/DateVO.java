package com.spring.board2.domain;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class DateVO {
	private int imageDate;

	public int getimageDate() {
		return imageDate;
	}

	public void setimageDate(int imageDate) {
		this.imageDate = imageDate;
	}

}
