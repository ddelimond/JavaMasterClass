package Scanners;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Scanners {

    static Scanner scanner = new Scanner(System.in);

/*
    // create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
    // create a variable which is assigned to the value passed into the scanner from the terminal
    // print this variable
 */
    public static void Ex1(){
        System.out.println("Enter a name.");
        String input = scanner.next();
        System.out.println("Hello "+input+"!");
    };

    /*
     Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
     You might compile and run the program via command line or by editing configuration and pass program arguments
     */

    private static void Ex2(){
        try{
            System.out.println("Enter a Integer please.");
            int num = scanner.nextInt();
            if(num % 2 == 0){
                System.out.println("Number is Even!");
            }
            else{
                System.out.println("Number is Odd!");
            }
        }catch(InputMismatchException e){
            System.out.println("You did not enter an Integer.");
        }

    }

    /*
        Write a program that takes an input number from the console and prints if number is prime
        Create a method to check if number is prime then use against the input
     */

    private static void Ex3(){
        try{
            System.out.println("Enter a Integer please.");
            int input = scanner.nextInt();
            int amountOfNumbersDivisibleBy = 0;

                if(input > 1){
                    for(int i=1; i<=9; i++){

                        if(input % i == 0 ){
                            amountOfNumbersDivisibleBy++;
                        }
                    }
                    if (amountOfNumbersDivisibleBy > 1){
                        System.out.println("Integer is a Composite number");
                    }
                    else{
                        System.out.println("Integer is a Prime number");
                    }
                }
                else if (input == 0 || input == 1){
                    System.out.println("Integer is neither a Prime or Composite number.");
                }
                else{
                    System.out.println("Integer is negative, please only use positive numbers.");
                }


        }catch(InputMismatchException e){
            System.out.println("You did not enter an Integer.");
        }
    }


    /*
    Write a method that displays random joke to the user.
    Your program should stop displaying jokes when use inputs no.
    For e.g
    Want to hear a joke? Yes/No
        if yes then display joke and repeat same question
        if no then program should exit

    public static void main(String[] args) {
        // use the code below to generate random numbers. In this case from 0 to 9
        Random random = new Random();
        int randomNumber = random.nextInt(9);
        System.out.println(jokes[randomNumber]);

        // You need to change random.nextInt(9); accordingly to match your jokes array length
    }
   */


    private static void Ex4(){
        try{
            String input;
            do {
                System.out.println("Do you want to hear a joke? Yes/No");
                input = scanner.next().toLowerCase();

                if(input.equals("yes")){
                    Random random = new Random();
                    int randomJokeIndex = random.nextInt(9);

                    String[] jokes = {
                            "Q: What’s Forrest Gump’s password? A: 1forrest1.\n",
                            "Q: What did the horse say after it tripped?\n A: Help! I’ve fallen and I can’t giddyup!\n",
                            "Q: What do you call an angry carrot?\n A: A steamed veggie.\n",
                            "Q: Why was Cinderella so bad at soccer?\n A: She kept running away from the ball!\n",
                            "Q: What do you call a sad strawberry?\n A: A blue berry!\n",
                            "Q: How do you organize a space party?\n A: You planet.\n",
                            "Q: I lost an electron.\n A: You really have to keep an ion them!\n",
                            "Q: When do computers overheat?\n A: When they need to vent.\n",
                            "Q:  How do rabbits travel?\n A: By hareplanes.\n",
                            "Q: What do you call a sleeping dinosaur?\n A: A dino-snore.\n"
                    };
                    System.out.println(jokes[randomJokeIndex]);
                }
            }
            while(input.equals("yes"));


        }catch(InputMismatchException e){
            System.out.println("sorry");
        }
    }






    public static void main(String[] args){
        Ex1();
        Ex2();
        Ex3();
        Ex4();

    }
}
