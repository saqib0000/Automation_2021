package day2_030721;

public class ActionItem {
    public static void main(String[] args) {

        String[] zipcode;
        int[] streetNumber;

        zipcode = new String[4];
        zipcode[0] = "11229";
        zipcode[1] = "11210";
        zipcode[2] = "11230";
        zipcode[3] = "14211";

        streetNumber = new int[4];
        streetNumber[0] = 222;
        streetNumber[1] = 333;
        streetNumber[2] = 444;
        streetNumber[3] = 555;

        for ( int i =0;i < zipcode.length; i++){

       System.out.println("my zipcode is " + zipcode[i] + " my street number is " + streetNumber[i] + ".");




        }//end of loop
    }//end of main method
}//end of java class
