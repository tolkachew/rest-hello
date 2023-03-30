package org.itstep.hello;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private static HelloRepo helloRepo = new HelloRepo();
    // Endpoint
    @GetMapping("/hello")
    public Hello hello(){
        return helloRepo.hello();
    }

    @GetMapping("/hello/{name}")
    public Hello helloName(@PathVariable String name){
        return  new Hello("Hello",name);
    }

    @GetMapping("/{hello}/{name}")
    public Hello helloR(@PathVariable String hello, String name) {
        return new Hello(hello , name);
    }

    @GetMapping("/hello2")
    public Hello helloP(@RequestParam String message, @RequestParam String name) {
        return new Hello(message, name);
    }

    @PostMapping("/hello") //REST
    public void changeName(@RequestBody Hello hello){
        helloRepo.changeName(hello.getName());
    }
}
