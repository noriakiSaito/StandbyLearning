@Grab("thymeleaf-spring5")

@Controller
class App {

    @RequestMapping("/")
    @ResponseBody
    def home(ModelAndView mav) {
	    mav.setViewName("home")
	    mav.addObject("msg","\u3053\u3093\u306b\u3061\u306f\uff01")
	    mav
    }

}
