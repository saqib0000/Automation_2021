package day3;

public class LoopwithConditionalStatemet {
    public static void main(String[] args) {

        String[] icecreamflavor = new String[4];
        icecreamflavor[0] = "chocolate";
        icecreamflavor[1] = "vanilla";
        icecreamflavor[2] = "strawberry";
        icecreamflavor[3] = "maple pecan";

        //using forloop with conditional statements print only when favorite flavor is vanilla and maple pecan
        for (int i = 0; i < icecreamflavor.length; i++) {
            if (icecreamflavor[i] == "strawberry") {
                System.out.println("My favorite flavor is " + icecreamflavor[i]);
            } else if (icecreamflavor[i] == "maple pecan") {
                System.out.println("My favorite flavor is " + icecreamflavor[i]);




            }// end of conditional statement
        }// end of for loop
    }//end of main method
}//end of java class

