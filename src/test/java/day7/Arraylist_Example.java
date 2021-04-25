package day7;

import java.util.ArrayList;

public class Arraylist_Example {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");


        for(int i =0;i< cities.size();i++){
            if(cities.get(i)=="Queens"){
                System.out.println("my city is " + cities.get(i));

            }





            //System.out.println("My city is " + cities.get(i));
        }//end of loop

    }//end of main method
}//end of java class
