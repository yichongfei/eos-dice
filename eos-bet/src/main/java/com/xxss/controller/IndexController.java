package com.xxss.controller;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class IndexController {
	
	
	
	
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request) {
		return "index";
	}
	
	

	@RequestMapping("/coin")
	public String coin(Model model, HttpServletRequest request) {
		return "coin";
	}
	@RequestMapping("/guoshanche")
	public String guoshanche(Model model, HttpServletRequest request) {
		return "guoshanche";
	}
	
	@RequestMapping("/one")
	public String one(Model model, HttpServletRequest request) {
		return "one";
	}
	
	@RequestMapping("/two")
	public String two(Model model, HttpServletRequest request) {
		return "two";
	}
	
	
	
}
