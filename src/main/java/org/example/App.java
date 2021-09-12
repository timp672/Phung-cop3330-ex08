/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int people=0;
        int pizzas=0;
        int slices=0;
        //Prompt user input
        System.out.println("How many people? " );
        String peopleStr = scan.nextLine();
        System.out.println("How many pizzas do you have? " );
        String pizzasStr = scan.nextLine();
        System.out.println("How many slices per pizza?" );
        String slicesStr = scan.nextLine();

        //Convert strings
        people = Integer.parseInt(peopleStr);
        pizzas = Integer.parseInt(pizzasStr);
        slices = Integer.parseInt(slicesStr);

        int totalSlices = pizzas * slices;
        int slicePer = totalSlices / people;
        int leftover = totalSlices % people;

        //Print output
        System.out.println( peopleStr+ " people with " +pizzasStr+ " pizzas (" +totalSlices+ " slices)" );
        System.out.println( "Each person gets " +slicePer+ " pieces of pizza." );
        System.out.println( "There are " +leftover+ " leftover pieces." );
    }
}
