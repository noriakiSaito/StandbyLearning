package com.tuyano.springboot;
/**
 * リスト5-22
 */
//import org.springframework.stereotype.Controller;
//
//@Controller
public class HelloController_List5_22 {

//	@Autowired
//	MyDataRepository repository;
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
