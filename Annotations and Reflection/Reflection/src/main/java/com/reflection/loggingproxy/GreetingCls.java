package com.reflection.loggingproxy;

public class GreetingCls implements Greeting {
    public void sayHello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Greeting greeting = new GreetingCls();
        Greeting proxyGreeting = DynamicProxy.createProxy(greeting, Greeting.class);
        proxyGreeting.sayHello();

    }
}