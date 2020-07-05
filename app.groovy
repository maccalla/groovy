@Grab("thymeleaf-spring5")

@Controller
class App {

    @RequestMapping("/")
    @ResponseBody
    def home(ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "名前を入力して送信してください")
        mav
    }

    @RequestMapping(value="/send", method=RequestMethod.POST)
    @ResponseBody
    def send(@RequestParam("text1")String str, ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "こんにちは、" + str + "!!")
        mav.addObject("value", str)
        mav
    }
}