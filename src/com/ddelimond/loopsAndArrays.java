package com.ddelimond;
import java.util.Arrays;

public class loopsAndArrays {
    /*
    public static void main(String[] args) {
    // declare an empty integer array of length = 3
    // print the contents to the console
}
     */
    private static void ex1(){
        int[] array = new int[3];
        System.out.println("1. "+Arrays.toString(array));
    }

    /*

    Continuing from previous exercise

    public static void main(String[] args) {
    // fill it with the number `4`
    // print the array to the console
}
     */

    private static void ex2(){
        int[] array = new int[3];
        array[0] = 4;
        array[1] = 4;
        array[2] = 4;
        System.out.println("2. "+Arrays.toString(array));
    }


    /*
    Continuing from previous exercise

    public static void main(String[] args) {
    // reassign the second value in the array to the number `17`
    // print the array to the console
}
     */

    private static void ex3 (){
        int[] array = new int[3];
        array[0] = 4;
        array[1] = 4;
        array[2] = 4;
        array[1] = 17;

        System.out.println("3. "+Arrays.toString(array));
    }

    /*
    What happens when you try to re-assign index 5 to any integer?

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
        }

     */

    private static void ex4(){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("3. "+"you get and error that informs you that your request is not in range");
        //numbers[5] = 21;
        //Error:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }

    /*

    public static void main(String[] args) {
    // declare and initialize a String array which holds the values "a", "b", "c" and "d"
    // print the array to the console

    }
     */


    private static void ex5(){
        String[] arr = {"a","b","c","d"};
        System.out.println("5. "+Arrays.toString(arr));

    }


        /*

    public static void main(String[] args) {
    // using your answer from Q5 above, create a second array which is initialized using your original array
    // hint: instead of using the `new` keyword, try simply giving the name of your original array
    // change the value at index 0 of the new array to "z"
    // print both of your arrays and compare

    }

     */

    private static void ex6(){
        String[] arr = {"a","b","c","d"};
        String[] arr2 = arr;
        arr2[0] = "z";
        System.out.println("6a. "+Arrays.toString(arr));
        System.out.println("6b. "+Arrays.toString(arr2));
    }


    /*

    public static void main(String[] args) {
    // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
    // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
    // change the value at index 0 of the new array to "z"
    // print both of the arrays and compare
    }
    */

    private static void ex7(){
        String[] arr = {"a","b","c","d"};
        String[] arr2 = Arrays.copyOf(arr,arr.length);
        arr2[0] = "z";
        System.out.println("7a. "+Arrays.toString(arr));
        System.out.println("7b. "+Arrays.toString(arr2));
    }

    /*

   public static void main(String[] args) {
    // create a for loop which goes from 0 to 10
    // print each value
    }

    */


    private static void ex8(){
       for(int i =0; i<=10;i++){
           System.out.println("8. "+i);
       }
    }

    /*
        public static void main(String[] args) {
        // create a for loop which goes from 10 down to 0
        // print each value
        }
    */

    private static void ex9(){
        for(int i =10; i>=0; i--){
            System.out.println("9. "+i);
        }
    }

    /*
        Create a loop that adds all numbers 0-10 to an array then prints the array
        public static void main(String[] args) {
            // create an array. Remember to manually set the size
            // create a for loop which goes from 0 to 10, adding each value to an array
            // print our array
        }
   */

   private static void ex10(){
       int[] arr = new int[11];
       for(int i = 0; i<=10; i++){
           arr[i] = i;
           System.out.println("10. "+Arrays.toString(arr));
       }
   }

   /*
   Create a loop that adds to a sum

   public static void main(String[] args) {
        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum
    }

    */

    private static void ex11(){
        int[] arr = {1,2,3,4};
        int sum = 0;
        for (int i = 0; i<=arr.length-1; i++){
            sum = sum + arr[i];
        }
        System.out.println("11. "+sum);
    }


    /*

    Create a loop that makes all words in an array uppercase, print the array

    Start with the array: ["i", "sure", "do", "love", "bees"]. Create a for loop which makes each word uppercase in the array.
    Print the contents of the array in the terminal.

    Hint: You could achieve this by either creating a second array which you add to, or by reassigning the values in the initial array.

     */

    private static void ex12(){

        String[] arr = {"i", "sure", "do", "love", "bees"};
        for(int i =0; i<= arr.length-1; i++){
            arr[i] = arr[i].toUpperCase();
        }
        System.out.println("12. "+Arrays.toString(arr));
    }

    /*
    Create a loop that capitalises each word in an array, prints the new array

    Start with the array: ["i", "sure", "do", "love", "bees"].
    Create a for loop which makes each word uppercase in the array. Print the contents of the array in the terminal.

    Hint: You could make use of the .charAt() method to grab a specific character (letter) at the specified index
    Hint: You could make use of the .substring() method which works on strings to grab the part of a given string forward
    from the specified index.
     */

    private static void ex13(){

        String[] arr = {"i", "sure", "do", "love", "bees"};

        for(int i = 0; i <= arr.length-1; i++){

            char cap = arr[i].toUpperCase().charAt(0);
            String body ="";

           if(arr[i].length() >1){
               body = arr[i].substring(1,arr[i].length());
               String newWord = cap+body;
               arr[i] = newWord;
           }
           else{
                body = body+cap;
               String newWord = body;
               arr[i] =newWord;
           }
        }
        System.out.println("13. "+Arrays.toString(arr));
    }



    /*

        public static void main(String[] args) {
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        }
     */

    private static void ex14() {
        String[] content = {"you", "are", "how", "hello" };
        String sentence = "";

        for (int i = content.length - 1; i >= 0; i--) {
            if (i == 0) {
                sentence = sentence + content[i];
            } else {
                sentence = sentence + content[i] + " ";
            }
        }
        System.out.println("14. " + sentence + "?");
    }

    /*
    public static void main(String[] args) {

        Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

        Tip:
        - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        - create variable to store result. double result = 0;
        - convert string to array by using the String[] numbers = input.slit(", ")
        - then loop.
        - convert each string to decimal and add to current result
            - use Double.parseDouble(string) to convert a string to double
}
     */

    public static void ex15(){
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] nums = input.split(", ");
        for (String num:nums){
          double x = Double.parseDouble(num);
          result = result + x;
        }
        System.out.println("15. "+result);
    }

    /*
    Write a program that takes arguments from the program args and loops through args and prints each item in args
    Compile using: javac and run using: java
    i.e. javac Exercise5.java | java Exercise5 foo bar baz

    public static void main(String[] args) {
        // loop through args here
    }
     */

    public static void ex16(String[] args){
        for(String arg: args){
            System.out.println("16. "+arg);
        }
    }




    public static void main (String[] args){

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16(args);



    }

}
