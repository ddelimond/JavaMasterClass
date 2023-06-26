package Exceptions;
import java.util.ArrayList;

public class Exception {


    /*
        write a program that converts program arguments to an integer
        if value cannot be converted to int store them somewhere
        calculate sum for numbers that can be converted to an integer
        finally print the numbers that cannot be converted to an int
        example: java com.amigoscode.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
        output: Sum: 6 and a, b, foo are not numbers.
     */

    public static void main(String[] args){
        int sum = 0;
        int index = 0;
        ArrayList<String> words = new ArrayList<>();

    try {
        for(String arg:args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
                index++;
                System.out.println(num);
            } catch (NumberFormatException e) {
                words.add(args[index]);
                System.out.println(words.toString());
            }
            continue;
        }

    }
    catch (java.lang.Exception e){
        System.out.println("An Error Occured");
    }
    finally {
       StringBuilder wordString = new StringBuilder();
       int lastWordIndex = words.size() -1;
       String lastWord = words.get(lastWordIndex);

        for(String word:words){
            if(word.equals(lastWord)){
                wordString.append(word);
            }
            else{
                wordString.append(word).append(',');
            }

        }
        if(words.size() ==1){
            System.out.printf("Sum: %d and %s is not a number",sum,wordString);
        }
        else if(words.size() == 0){
            System.out.printf("Sum: %d all arguments were numbers",sum);
        }
        else{
            System.out.printf("Sum: %d and %s are not numbers",sum,wordString);
        }
    }

    /*
    run the above code see what error you get
    then surround it with try catch block and catch the exception that was thrown.
    Inside catch the catch block print "cannot divide by 0"
     */







    }
}
