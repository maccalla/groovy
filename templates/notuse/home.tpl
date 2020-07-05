html {
    head {
        title('index page')
    }
    body {
        h1('hello')
        p('this is groovy template')
        div(){
            a(href:'http://google.com'){
                yield 'google link!!!'
            }
        }
    }
}