package com.pluralsight;

public class Hello {
    public static void main(String[] args) {

        String greeting = "Hello, World!";
        greet(greeting);

        String fairwell = "Goodbye!";
        goodbye(fairwell);
    }
    public static void greet(String message){
        System.out.println(message);
    }
    public static void goodbye(String message){
        System.out.println(message);
    }
}
