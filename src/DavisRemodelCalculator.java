/*
 * The Remodel Calculator will do the following:
 *   Asks user for dimensions of room in inches.
 *   Asks user how many rooms they want to remodel.
 *   Computes and displays the paint needed in gallons and the carpet
 *     needed in square yards to remodel the total number of rooms.
 */

import java.util.Scanner;

/**
 * @author Erik Davis
 * @version 1.0, Java Assn 2
 */
public class DavisRemodelCalculator {

    public static void main(String[] args) {
        
        System.out.println("Good day. The Remodel Calculator will calculate how"
                + " many gallons of paint and how many sqaure yards of carpet \n"
                + "you will need to remodel a room. We will assume you will be "
                + "remodeling a room with four walls and you are not \npainting "
                + "the ceiling. You will also be able to indicate if you are "
                + "remodeling many rooms of the same dimensions.");
       
        //Statements to read and store input data from user
        System.out.println();
        System.out.println("First, we will need the dimensions of the room you "
                + "will remodel.");
        System.out.println("What is the length of the room in inches?");
        Scanner keyboard = new Scanner(System.in);
        double lengthIn = keyboard.nextDouble();
        System.out.println("What is the width of the room in inches?");
        double widthIn = keyboard.nextDouble();
        System.out.println("What is the height of the room in inches?");
        double heightIn = keyboard.nextDouble();
        System.out.println("How many rooms of this size are you remodeling?");
        int numOfRooms = keyboard.nextInt();
        
        //Statements to perform calculations
        double carpetIn2 = lengthIn * widthIn * numOfRooms;
        double carpetYd2 = carpetIn2 / 1296;
        double wallSurfaceIn2 = (lengthIn * heightIn * 2) +
                (widthIn * heightIn * 2);
        double wallSurfaceTotalIn2 = wallSurfaceIn2 * numOfRooms;
        double wallSurfaceTotalFt2 = wallSurfaceTotalIn2 / 144;
        double paintGallons = wallSurfaceTotalFt2 / 350;
       
        //Statements to display output results
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Remodel Supply Report");
        System.out.println();
        System.out.println("For " + numOfRooms + " rooms of size:");
        System.out.println("    " + lengthIn + " inches long by");
        System.out.println("    " + widthIn + " inches wide by");
        System.out.println("    " + heightIn + " inches high");
        System.out.println();
        System.out.println("You will need:");
        System.out.printf("    %.2f sqaure yards of carpet", carpetYd2);
        System.out.println();
        System.out.printf("    %.1f gallons of paint", paintGallons);
        System.out.println();
        System.out.println();
    }
}
