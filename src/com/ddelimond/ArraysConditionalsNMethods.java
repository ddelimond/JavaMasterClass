package com.ddelimond;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysConditionalsNMethods {

    /*
    Write a method that reverses any String and print to console
    Input should be a string
    Output should be reversed input
     */
    private static void ex1(){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter an word!");

        String nxt = s.next();
        String newStr = "";

        for(int i = nxt.length()-1; i>=0; i--){
          char letter = nxt.charAt(i);
          newStr = newStr+letter;
        }

        System.out.println("1. "+newStr);
    }




    /*

    Given the following String input
    String input = "   amig os cod e  "
    Write a method that transforms input into: Amigoscode
     */

    private static void  ex2(){
        String input = "   amig os cod e  ";
        input = input.strip();
        String output = "";


        for ( int i=0; i<=input.length()-1;i++){
            if(input.charAt(i) == ' ') {
                continue;
            }else{
                char letter = input.charAt(i);
                output = output+letter;
            }
        }
        System.out.println("2. "+output);
    }


    /*
    Write a method that finds the longest string in any given array.
    i.e. [] -> ""
    i.e. ["hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */

    private static void ex3(){
       String[] arr = { "uno", "dos", "tres", "quatro"};
       String longest = "";
       for(String word: arr){
           if(word.length() > longest.length()){
               longest = word;
           }
       }
        System.out.println("3. "+longest);
    }

    public static void main(String[] args){
        ex1();
        ex2();
        ex3();
    }
}
