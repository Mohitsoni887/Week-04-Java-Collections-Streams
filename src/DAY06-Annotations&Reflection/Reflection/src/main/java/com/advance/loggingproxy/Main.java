package com.advance.loggingproxy;


public class Main {
    public static void main(String[] args) {

        Greeting greeting = new GreetingImpl();


        Greeting proxy = LoggingProxy.createProxy(greeting, Greeting.class);


        String message = proxy.sayHello("Pragya");


        System.out.println(message);
    }
}