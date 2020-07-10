package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.HelloBean;
import com.demo.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

//	@RequestMapping(value = "/hello")
//	public String init(Model model) {
//
//		List<HelloBean> list = helloService.selectName();
//		model.addAttribute("list", list);
//
//		return "hello";
//	}

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		Iterable<HelloBean> list = helloService.selectName();
		mav.addObject("list", list);
		return mav;

	}

}
