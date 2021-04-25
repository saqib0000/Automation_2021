package day3;

public class MultipleCondition_ifelseifelse {
    public static void main(String[] args) {

       //using multiple conditional statements
       int a,b,c;
       a = 2;
       b = 2;
       c = 4;
       //verify either a + b > c, a + b < c, a + b = c
        /* your last statement,u have to end with else, instead of else if
       if previous two conditions didnt match, then you can just end with else statement.
      if {system print} else if {system print} else {system print}/end of multiple condition.

        */

        if (a + b> c){
         System.out.println(" a plus b is greater than c");
        } else if (a + b < c){
            System.out.println("a plus b is less than c");
        } else{
            System.out.println("a plus b equals c");

        }//end of multiple condition
    }//end of main method
}//end of java class
