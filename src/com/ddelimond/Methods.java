package com.ddelimond;

public class Methods {

    /*
    Write a method which takes two numbers as arguments and prints their sum to the terminal.
     */

    private static void getSum(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println("1. " + sum);
    }


    /*
    Write a method which takes a number as an argument and returns that number negated
    , e.g. passing 5 as an argument should return -5; passing -10 should return 10.
     */
    private static void getOppositeValue(int num1) {
        int result = -num1;
        System.out.println("2. " + result);
    }



    /*
    Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.

    You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false when it is supposed to.
     */

    private static void isEqual(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("3. Values are equal");
        } else {
            System.out.println("3. Values are not equal");
        }
    }

    /*
    Write a method which takes two numbers as arguments and prints one of:

    "The first number is larger"
    "The second number is larger"
    "The numbers are equal"
    as appropriate.
     */

    private static void compareValues(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("4. Values are equal");
        } else if (num1 > num2) {
            System.out.println("4. First value is larger");
        } else {
            System.out.println("4. Second value is larger");
        }
    }


    /*
    Write a method which takes a string as an argument, capitalizes the first letter and returns the capitalized string.

    HINT: The .toUpperCase() method will capitalize the whole string.
    Investigate how to split the first letter from the string, capitalize that, then join the pieces back together

     */


    private static void capitalizeFirstLetter(String str) {
        char cap = str.toUpperCase().charAt(0);
        String body = str.substring(1, str.length());
        str = cap + body;
        System.out.println("5. " + str);
    }


    /*
    Write a method which takes an array of strings as an argument and returns the number of items in the array.
    */

    private static void getArrayLength(String[] arr) {
        System.out.println("6. " + arr.length);
    }



    /*
    Write a method which takes a sentence as an argument,
    counts the number of words in the array and prints "The sentence contains X words".
     */

    private static void countNumberOfWords(String sentence){
      String[] sent = sentence.split(" ");
      int numOfWord = sent.length;
        System.out.printf("The sentence contains "+numOfWord+" words.");
    }


    public static void main(String[] args) {
        getSum(21, 50);
        getOppositeValue(21);
        isEqual(100, 100);
        compareValues(56, 75);
        capitalizeFirstLetter("america");
        getArrayLength(new String[]{"uno", "dos", "tres", "quatro" });
        countNumberOfWords("Salt, pepper, ketchup and hot sauce");

    }
}
