package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //input
        Scanner reader = new Scanner(System.in);
            //decide number of walls, make arrays with size num. walls
            System.out.println("How many surfaces are you painting?");
            //int input
        int numwalls;
        do {
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number! Try again silly!");
                reader.next(); // this is important!
            }
            numwalls = reader.nextInt();
        } while (numwalls <= 0);
            //create int arrays, size of numwalls
            int[] wallheight = new int[numwalls];
            int[] wallwidth = new int[numwalls];
            int[] wallarea = new int[numwalls];
            float[] wallpaint = new float[numwalls];
            float[] wallcost = new float[numwalls];
            //output text confirming numwalls
            System.out.println("Thanks, you have "+ numwalls + " walls to paint.");
            //space for error test

        //System.out.println(wallheight.length);
        for (int i = 0; i < numwalls; i++) {
            System.out.println("For wall " +(i+1)+" what is the HEIGHT in m?");
            do {
                while (!reader.hasNextInt()) {
                    System.out.println("That's not a number! Try again silly!");
                    reader.next(); // this is important!
                }
                wallheight[i] = reader.nextInt();
            } while (wallheight[i] <= 0);

            System.out.println("For wall " +(i+1)+" what is the WIDTH in m?");
            do {
                while (!reader.hasNextInt()) {
                    System.out.println("That's not a number! Try again silly!");
                    reader.next(); // this is important!
                }
                wallwidth[i] = reader.nextInt();
            } while (wallwidth[i] <= 0);
        }

        for (int i = 0; i < numwalls; i++) {
            wallarea[i] = wallheight[i] * wallwidth[i];
            wallpaint[i] = (float) (wallarea[i] * 0.1);
            wallcost[i] = (float) (wallpaint[i] * 9.1);
            System.out.println("Wall " +(i+1)+ " is " + wallarea[i] + " m squared");
            System.out.println("You will need " + wallpaint[i] + " litres of paint to cover wall " +(i+1) );
            System.out.println("This will cost you about " + wallcost[i] + " pounds quid");
        }

    }}

