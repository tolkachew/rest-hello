package org.itstep.hello;

//POJO
public class Hello {
    private String message = "Hello ";
    private String name = "world";

    //No args constructor
    public Hello() {
    }

    public Hello(String message, String name) {
        this.message = message;

        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

}