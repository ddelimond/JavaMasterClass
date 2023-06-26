package Exceptions;

public class partTwo {



        public static void main(String[] args) {
            try{
                int result = 10 / 0;
            }
            catch(ArithmeticException e){
                System.out.println("Unable to divde by a zero");
            }

        }
}
