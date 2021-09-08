package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var reader = new Scanner(System.in); //
        System.out.print("How old are you:"); //prompting user to enter their age using system.out.print
        var age = reader.nextFloat(); //setting the variable age
        var dogYears = age*7; //setting the variable dogYears by multiplying age by 7
        System.out.println("Wow you are " + age+" that is "+ dogYears+" in dog years"); //calling for the two variables age and dog years

    }
}
