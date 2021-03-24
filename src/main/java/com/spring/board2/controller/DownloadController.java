package com.spring.board2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.spring.board2.domain.DateVO;
import com.spring.board2.domain.ImageVO;
import com.spring.board2.persistence.Daoimpl;
import com.spring.board2.service.DownloadService;
import com.spring.board2.logging.Logging;

import lombok.extern.slf4j.Slf4j;

@Controller
/* @Slf4j */
public class DownloadController {
	
	@Autowired
	DateVO date;
	@Autowired
	ImageVO image;
	@Autowired
	Daoimpl imageDAO;
	@Autowired
	DownloadService downloadService;
	
	@RequestMapping(value = "/download")
	public String openDownloadJsp() {
		return "download";
	}
	
	
	
	public DownloadController() {
	}



	@RequestMapping(value = "/sendDateAndShowImage", method = RequestMethod.GET)
	public String sendDate(@RequestParam("imageDate") int date, Model model) {
		
		/*
		 * Logging log = new Logging(); log.info("Date Data!!!!!!!!!");
		 */
		//date로 DB에 접속해서 image가져온다(DAO, ImageVO필요) imageVO를 model에 담는다
		
		System.out.println("!!!!!!!!!!!!model : " + model);
		model.addAttribute("imageFromController", downloadService.readImage(date).getImgFile());
		
		
		
		return "download";
	}
	
//	
//	@RequestMapping(value = "/downloadImage", method = RequestMethod.POST)
//	public donwloadImage() {
//		
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
