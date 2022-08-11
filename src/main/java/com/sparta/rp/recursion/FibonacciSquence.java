package com.sparta.rp.recursion;

import java.util.Arrays;

public class FibonacciSquence {

        public static int getElementFromFibonacci(int element){
            if(element == 0 ){
                return element;
            } else if (element == 1 || element == 2){
                return 1;
            } else {
                return (getElementFromFibonacci(element-1) + getElementFromFibonacci(element-2));
            }
        }
        public static void printFibonacciTillElement(int element){
            System.out.println(Arrays.toString(getFibonacciSequence(element)));
        }

    private static int[] getFibonacciSequence(int element) {
            int [] fibonacciSquence = new int[element];
        for(int i = 0; i < element; i++){
            fibonacciSquence[i] = getElementFromFibonacci(i);
        }
        return fibonacciSquence;
    }

    public static void main(String[] args) {
            System.out.println(getElementFromFibonacci(3));
            printFibonacciTillElement(5);

        }
    }

