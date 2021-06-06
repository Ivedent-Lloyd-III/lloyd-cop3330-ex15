package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 15
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("What is the password? ");
        String password = in.next();

        if (password.equals("abc$123")){

           System.out.print("Welcome!");

        }
        else{

            System.out.print("I don't know you.");

        }

    }

}
