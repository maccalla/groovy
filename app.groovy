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

    @RequestMapping("/home")
    def home() {
        def header = "<html><body>"
        def footer = "</body></html>"
        def content = "<h1>Hello!</h1><p>this is html content.</p>"

        header + content + footer
    }
}