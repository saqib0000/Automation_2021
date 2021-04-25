package day3;

public class ifelse_condition {

    public static void main(String[] args) {

        //declare integer variables
        int a,b;
        a = 4;
        b = 3;

        //using if condition, verify that a is less than b
        //it will not print anything if a is not less than b

        if ( a < b){

            //System.out.println( "a is less than b");

        }// end of if condition

        /*using if else condition, verify if a is less than b, else it is greater or equal to b

        if else condition is used when you have 2 conditions. after if, in the () parenthesis u have to write the condition.
        when you print it you hav eto write the statement that u want printed.
         */
        if ( a < b){
            System.out.println( "a is less than b");
        } else {
            System.out.println("a is greater than or equal to b");

            //using<= operator verify if a is less than b or is equal to b
            //you can change less than to greater than according to the variables

        }//end of if else condition

            if (a <= b) {

                //System.out.println("a is less than b or a is equal to b");



            }//end of if else
    }//end of main method
}//end of java class

