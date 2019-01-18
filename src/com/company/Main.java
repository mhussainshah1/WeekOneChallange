package com.company;

import java.util.Scanner;

/**
 *
 * A prime number is a number that has only itself and 1 as a factor. 
 * This means that for each of the numbers from 2 to that number, the number cannot be divided without a remainder. 
 * For example, 9 is not a prime number because it can be divided by 3 without a remainder. But 7 is a prime number
 * because it cannot be divided by 2, 3, 4, 5, or 6 without a remainder. 
 * Write an appliation that will that show a list of numbers and indicate whether or not they are prime.
 * The user will have to input the last number in the range, and you will print all of the numbers from 1 to that number. 
 * For example you would have the numbers from 1 to 10 as follow:
 *
 * 1 is not a prime number 
 * 2 is a prime number 
 * 3 is a prime number 
 * 4 is not a prime number
 * 5 is a prime number 
 * 6 is not a prime number 
 * 7 is a prime number 
 * 8 is not a prime number 
 * 9 is not a prime number 
 * 10 is not a prime number
 *
 */

public class Main {

    public static void main(String[] args) {

        int n;
        boolean checkPrime;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number ");
        n =  keyboard.nextInt();

        System.out.println("1 is not a prime number ");

        for (int i = 2; i <= n ; i++) {
            checkPrime = true;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0){
                    checkPrime = false;
                    break;
                }
            }
            if(checkPrime) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }
        }
    }
}
