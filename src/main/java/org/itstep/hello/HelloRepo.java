package org.itstep.hello;

public class HelloRepo {
    //Data
    private static Hello hello = new Hello();

    public Hello hello(){
        return hello;
    }
    public Hello helloName(String name){
        return new Hello("Hello", name);
    }

    //Put
    public void changeName(String name){
        hello().setName(name);
    }
}
