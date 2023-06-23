package Enums;

import Practice.Practice;

import java.util.Arrays;

public class Enums {

    /*
        create enum to represent t-shirt sizes from small to extra extra large
     */

        enum TshirtSizes{
            S,
            M,
            L,
            XL,
            XXL
        }
     /*
       Remove the above enum from this class and put it as separate file.
       You should create a separate class of type enum
       Run this code and should print T Shirt Size: M
     */

    private static void Ex2(){
        System.out.println("T Shirt Size: "+ Sizes.M);
    }


    /*
        invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
        hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
     */
    private static void Ex3(){

        Enum [] arr = TshirtSizes.values();
        for(Enum size:arr){
            String lowerCaseSize = size.name().toLowerCase();
            System.out.println(lowerCaseSize);
        }


    }




    public static void main (String[] arg){

        Ex2();
        Ex3();

    }
}
