package com.example.demo;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repositories.ClientRepository;

@Controller
public class PosgresSampleController {

//	@Autowired
//	ClientRepository repository;
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView index(@ModelAttribute("formModel") Client tmp, ModelAndView mav) {
//		mav.setViewName("index");
//		Iterable<Client> list = repository.findAll();
//		mav.addObject("list", list);
//		return mav;
//	}
//
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	@Transactional
//	public ModelAndView form(@ModelAttribute("formModel") Client tmp, ModelAndView mav) {
//		repository.saveAndFlush(tmp);
//		return new ModelAndView("redirect:/");
//	}

	@Autowired
	ClientRepository repository;

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		Iterable<Client> list = repository.findAll();
		mav.addObject("list", list);
		return mav;

	}

}
