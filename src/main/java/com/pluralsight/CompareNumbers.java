package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isPositive(-17));

    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static boolean isPositive(double number){
        return number > 0;
    }
}
// a. Create a main() method
//b. Create this method: isEven(int number)
//a. returns true if even
//c. Create: isPositive(double number)
//a. returns true if > 0
//d. Call these within a System.out.println() in main() to check if your
//methods work or not. EX. System.out.println(isEven(5)); should
//display false