package Dates;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class Dates {

    private static void Ex1(){
        System.out.println("1. Today's Date: "+LocalDate.now());
        System.out.println("1. Current Time: "+LocalTime.now());
    }

    private static void Ex2(){
        System.out.println("2. My Birthday: "+LocalDate.of(1994, Month.SEPTEMBER,21));
    }

    private static void Ex3(){
        LocalDate dob = LocalDate.of(1994, Month.SEPTEMBER,21);

        LocalDate daysIntoTheFuture = dob.plusDays(100);
        System.out.println("3. 100 Days after my birthday: "+daysIntoTheFuture);
    }

    private static void Ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your  birth date in the following format: YYYY-MM-DD ");
        String birthdayStr = scanner.next();
        System.out.println("Enter a  date in the following format: YYYY-MM-DD ");
        String dateStr = scanner.next();

        String[] birthdateArr = birthdayStr.split("-");
        String[] dateArr = dateStr.split("-");


       int birthdayYear = Integer.parseInt(birthdateArr[0]);

       int dateYear = Integer.parseInt(dateArr[0]);

     if(birthdayYear > dateYear){
         System.out.printf("You were not born yet");
     }
     else{
         int age = dateYear - birthdayYear;
         System.out.printf("You will be %d years old on this year",age);
     }
    }







    public static void main(String[] args){

        Ex1();
        Ex2();
        Ex3();
        Ex4();
    }
}
