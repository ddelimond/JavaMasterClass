package Conditionals;

public class Conditionals {

    /*
    // QUESTION 1

    public static void main(String[] args) {
        // create an integer variable
        // create a second integer variable
        // create an `if` statement which compares the two variables and prints to the console if they are equal
    }
     */


    private static void ex1() {
        int num1 = 15;
        int num2 = 21;

        if (num1 == num2) {
            System.out.println("1. Variables are equal");
        } else {
            System.out.println("1. Variables are not equal");
        }
    }


    /*
// Question 2

    public static void main(String[] args) {
        // create a string variable
        // create a second string variable which has the same value as the first
        // create an `if` statement which compares the two variables and prints to the console if they are equal
    }

     */

    private static void ex2() {

        String favBallPlayer = "Derrick Rose";
        String secondFav = "Derrick Rose";

        if (favBallPlayer == secondFav) {
            System.out.println("2. Variables are equal");
        } else {
            System.out.println("2. Variables are not equal");
        }
    }

    /*
    // QUESTION 3

    public static void main(String[] args) {
        // create an string variable using the `new` keyword
        // create a second string variable which has the same value as the first, again using the `new` keyword
        // create an `if` statement which compares the two variables and prints to the console if they are equal
    }
     */

    private static void ex3() {
        String str1 = new String("Denzel Washington");
        String str2 = new String("Denzel Washington");

//      if (str1 == str2){
        if (str1.equals(str2)) {
            System.out.println("3. Variables are the same");
        } else {
            System.out.println("3. Vairables are not the same");
        }
    }
/*
// QUESTION 4

    public static void main(String[] args) {
        // create two `int` variables. Assign them values
        // create an `if` statement which compares whether one value is greater than the other
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
    }
 */


    private static void ex4() {
        int num1 = 21;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println("4. Values are equal");
        } else {
            System.out.println("4. Values are not equal");
        }
    }

    /*
    // QUESTION 5

    public static void main(String[] args) {
        // create three `int` variables. Assign them values with the first value sitting between the other two
        // create an `if` statement which compares whether the first value is greater than the second AND less than the third
        // print something to the console if the condition is met
        // create an `else` statement which prints to the console if the above condition is NOT met
     */

    private static void ex5() {
        int num1 = 21;
        int num2 = 10;
        int num3 = 30;


        if (num1 > num2 && num1 < num3) {
            System.out.println("5. Both conditions met");
        } else {
            System.out.println("5. Condition has not be met");
        }
    }

    /*
    Modify your answer to Question 5 to instead use an OR operator.
    Play about with the values assigned to your three variables, noting how the behaviour changes.
    */
    private static void ex6() {
        int num1 = 45;
        int num2 = 68;
        int num3 = 75;


        if(num1 > num2 || num1 < num3){
            System.out.println("6. One condition is met");
        }
        else{
            System.out.println("6. Condition has not been met");
        }
    }



/*
public static void main(String[] args) {
    // create a String variable and assign it a value
    // create an `if` statement which grabs the first letter of your word and compares it against a Character value
    // print something to the console if the condition is met
}
 */

    private static void ex7(){
        String str = "Derrick Rose";
        char firstChar = str.charAt(0);
        if(firstChar == 'd'){
           System.out.println("7. First character is the same");
        }
        else{
            System.out.println("7. First character is not the same");
        }
    }

    /*

public static void main(String[] args) {
        // create a String variable and assign it a value
        // create a `for` loop which wraps around your answer from Question 7
        // modify your `if` statement to check the character at each index
        // Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
        // print something to the console if the condition is met
    }
     */

    private static void ex8(){
        String str = "Virgo";
        char letter = 'g';

        for(int i = 0; i<=str.length()-1; i++){
            if(str.charAt(i) == letter ){
                System.out.println("8. character found");
//                break;
            }
            else{
                System.out.println("8. character is not found");
            }
        }

    }

    /*
        public static void main(String[] args) {
        // create a for loop which goes from 0 to 20
        // print each even value
    }
     */

    private static void ex9(){
        for (int i = 0; i<= 20; i++){
            if (i % 2 ==0){
                System.out.println("Even: "+i);
            }
            else{
                System.out.println("Odd: "+i);
            }
        }
    }


    public static void main(String[] args){

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
    }

}
