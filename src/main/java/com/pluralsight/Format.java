package com.pluralsight;

public class Format {
    public static void main(String[] args) {
//        a. Create a main() method
//        b. Create this method: formatName(String first, String last)
        String fullName = formatName("Bob", "Smith");
        System.out.println(fullName);
        // a. It should RETURN "Last, First" format
        // b. Example: formatName("Bob", "Smith") returns "Smith, Bob"
        // c. Call it in your main and put it in the () of a System.out.println().

    } //userName stores the variable
    public static String formatName(String first, String last){
        String userName = last + " " + first;
        return userName;
    }
}
