/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_15;

import java.util.Scanner;

public class passwordCheck {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String inputPassword;
        String passwordCompare = "abc$123";
        System.out.print("What is the password?");
        inputPassword = Input.next();
        if(inputPassword.equals(passwordCompare))
        {
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
}
