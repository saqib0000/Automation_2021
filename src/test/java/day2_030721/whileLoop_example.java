package day2_030721;

import com.sun.jdi.PathSearchingVirtualMachine;

public class whileLoop_example {
    public static void main(String[] args) {

        String[] cities;

        cities = new String[4];
        cities[0] = "brooklyn";
        cities[1] = "queens";
        cities[2] = "manhattan";
        cities[3] = "bronx";
    //set the initializer i
        int i = 0;
        //set the gate keeper/end point for while
        while (i < cities.length) {

            System.out.println("my city is " + cities[i]);

            //set the counter
            i = i + 1;

        }//end of while loop
    }//end of main method
}//end of java class
