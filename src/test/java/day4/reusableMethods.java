package day4;

public class reusableMethods {

    // create a reusable method which will add 2 numbers and print out the statement
    //you have to create another () inside to add two numbers
    //static means u can share the method
    //public means modifier, it is always the beginning
    // void means it executes without returning

    public static void addTwoNumbers(int number1,int number2){

        System.out.println("my result is" + (number1+number2) );
    }//end of method


    //create a return method which will subtract two numbers and print as well
    //return the result
    //after static, you have to write int or string(what kind of value u want) instead of void

    public static int subtractTwoNumbers(int number1,int number2){
        int result = number1 - number2;
        System.out.println("my result is " + (number1-number2));
        return result;

        //end of method2
    }//end of java class









}//end of java class
