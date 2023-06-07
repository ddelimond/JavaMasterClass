package com.ddelimond;

/*
public static void main(String[] args) {
    // Write a program that transform "amigoscode" to "Amigoscode"
}
 */

public class Ex6 {
    public static void main(String[] args){
        String str = "amigoscode";
        char capital = str.toUpperCase().charAt(0);
        String sub = str.substring(1,str.length());
        str = capital+sub;
        System.out.println(str);
    }
}
