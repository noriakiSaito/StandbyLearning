package com.tuyano.springboot;

/**
 * リスト5-30
 */
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.tuyano.springboot.repositories.MyDataRepository;

//@Controller
public class HelloController_List5_32 {

//	@Autowired
//	MyDataRepository repository;
//
//	@PostConstruct
//	public void init(){
//		MyData d1 = new MyData();
//		d1.setName("tuyano");
//		d1.setAge(123);
//		d1.setMail("syoda@tuyano.com");
//		d1.setMemo("090-999-999"); // ●
//		repository.saveAndFlush(d1);
//		MyData d2 = new MyData();
//		d2.setName("hanako");
//		d2.setAge(15);
//		d2.setMail("hanako@flower");
//		d2.setMemo("080-888-888"); // ●
//		repository.saveAndFlush(d2);
//		MyData d3 = new MyData();
//		d3.setName("sachiko");
//		d3.setAge(37);
//		d3.setMail("sachico@happy");
//		d3.setMemo("070-777-777"); // ●
//		repository.saveAndFlush(d3);
//	}
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView index(@ModelAttribute("formModel") MyData mydata, ModelAndView mav) {
//		mav.setViewName("index");
//		mav.addObject("msg", "this is sample content.");
//		mav.addObject("formModel", mydata);
//		Iterable<MyData> list = repository.findAll();
//		mav.addObject("datalist", list);
//		return mav;
//	}
//
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	@Transactional(readOnly = false)
//	public ModelAndView form(@ModelAttribute("formModel") @Validated MyData mydata, BindingResult result, ModelAndView mov) {
//		ModelAndView res = null;
//		if (!result.hasErrors()) {
//			repository.saveAndFlush(mydata);
//			res = new ModelAndView("redirect:/");
//		} else {
//			mov.setViewName("index");
//			mov.addObject("msg", "sorry, error is occured...");
//			Iterable<MyData> list = repository.findAll();
//			mov.addObject("datalist", list);
//			res = mov;
//		}
//		return res;
//	}

}
