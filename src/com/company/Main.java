package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);                                                            // . Calling the class Scanner for retrieving the input from the user.

    public static void main(String[] args) {

        System.out.println("Enter length array: ");                                                                     // . Printing the string asking for the count.
        int count = scanner.nextInt();                                                                                  // . Setting the value from input in the count variable.
        scanner.nextLine();                                                                                             // . Enter key.

        int[] array = new int[count];                                                                                   // . Creating an array with the length = count, got it from the user.
        fillArray(array);                                                                                               // . Calling the method "fillArray", passing the array as a parameter.
        System.out.println(Arrays.toString(array));                                                                     // . Printing the array.
        reverse(array);                                                                                                 // . Calling the method "reverse", passing the array as a parameter.
        System.out.println(Arrays.toString(array));                                                                     // . Printing the array.
    }


    // Method optional for the challenge.

    public static int[] fillArray(int[] array){                                                                         // . Creating the method fillArray, the purpose of it is to fill the array passed as a parameter by the input of the user.
        for(int i = 0; i < array.length; i++){                                                                          // . For loop that goes for the whole length of the array passes.
            System.out.println("Insert value for the position : " + i + "\r");                                          // . Printing a String, asking the user for a value.
            while(!scanner.hasNextInt()){                                                                               // . While loop (infinite) that executes only if the value passed isn't a int, thanks to the method "hasNextInt()" of the class Scanner.
                System.out.println("Invalid value.");                                                                   // . Printing a String, Explaining the user that the value isn't accepted.
                scanner.next();                                                                                         // . Waiting for the next input.
            }                                                                                                           // . If the value is an Integer.
            array[i] = scanner.nextInt();                                                                               // . Setting the value retrieved in input, in the position i in the array.
        }
        return array;                                                                                                   // . Returning the array filled from the input from the user.
    }


    public static void reverse(int[] array) {                                                                           // . Creating the method reverse, the purpose of it is to reverse the array passed as a parameter.

        int countdown = array.length - 1;                                                                               // . Creating a variable "countdown", it will be used as a index for the array but from the end to the beginning. Set the value to the length of the array -1 (0,1,2,3 - length = 4 but positions are from 0 to 3)..
        int half = array.length/ 2;                                                   // TRICKIEST PART //              // . Creating a variable "half", setting the value as the half length of the array. Why?
                                                                                                                        //   take the array  12345 - substitute the first for the last and vice versa -  52341 - the second for the n-1 - 54321.
                                                                                                                        //   when it reach the half the array is reversed, if it goes fully it will put it back to the original conditions.
        for (int i = 0; i < half; i++) {                                                                                // . Creating a for loop to go through half of the array.
            int temp = array[i];                                                                                        // . Creating a variable "temp", setting the value from the array in position i.
            array[i] = array[countdown];                                                                                // . In the position i of the array, setting the value of the array in position countdown.
            array[countdown] = temp;                                                                                    // . In the position countdown of the array, setting the value stored in the temp variable.
            countdown--;                                                                                                // . Decreasing the countdown by 1;
        }
    }
}