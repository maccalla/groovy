@RestController
class HelloApplication {
    @RequestMapping("/")
    def hello() {
        "Hello, world!"
    }

    @RequestMapping("/bye")
    def bye() {
        "Good Bye, world!"
    }
}