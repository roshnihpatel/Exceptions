package com.sparta.rp.exceptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        int[] numbers = {1,5,7,8,9};
//        try {
//            System.out.println(numbers[10]);
//        }catch (IndexOutOfBoundsException e){
//            //System.out.println(e.getMessage());
//            System.err.println("Something went wrong!");
//        }catch (ArithmeticException e){
//            System.out.println("Help! Something went really wrong!!");
//        }finally {
//            //Run no matter what happens
//
//        }
        try {
            printNameInList();
        }catch (YouMessedUpException e){
            System.out.println(e.getMessage());
        }

    }
    private static void printNameInList() throws ArithmeticException, YouMessedUpException {
        String [] names = {"Roshni", "Leanne", "Omer"};
        if(names.length<4){
            throw new YouMessedUpException("Roshni");
        }
    }
}
