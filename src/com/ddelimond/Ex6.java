package com.ddelimond;

/*
public static void main(String[] args) {
    // Write a program that transform "amigoscode" to "Amigoscode"
}
 */

public class Ex6 {
    public static void main(String[] args){
        String str = "amigoscode";
        str = str.substring(1,str.length());
        System.out.println("A"+str);
    }
}
