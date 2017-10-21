@RestController
class MyFirstCFapp {

    @RequestMapping("/")
    String home() {
        return "Hello Hello World!"
    }

}