@Grab("thymeleaf-spring5")

@Controller
class App {

    @RequestMapping("/")
    @ResponseBody
    def home(ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "this is msg.")
        mav
    }
}