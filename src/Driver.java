
/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */

import java.util.Scanner;

/**
 * Driver class for the lab 4 program. Contains the main execution method
 *
 * @author Ian Guswiler
 * @version 1/11/2016
 */
public class Driver {
    private static Scanner input = new Scanner(System.in);


    /**
     * Checks user input for how many horses to add to a portfolio and adds them
     *
     * @param items portfolio for the horses to be added to
     */
    public static void horseCheck(Portfolio items){
        System.out.println("How many horses?");
        int numberOfHorses = input.nextInt();
        items.addHorses(numberOfHorses);
    }

    /**
     * Checks user input for how many egg layer chickens to add to a portfolio and adds them
     *
     * @param items portfolio for the egg layer chickens to be added to
     */
    public static void layerCheck(Portfolio items){
        System.out.println("How many egg laying chickens?");
        int numberOfLayers = input.nextInt();
        items.addChickens(numberOfLayers, "egg layer");
    }

    /**
     * Checks user input for how many broiler chickens to add to a portfolio and adds them
     *
     * @param items portfolio for the broiler chickens to be added to
     */
    public static void broilerCheck(Portfolio items){
        System.out.println("How many broiler chickens?");
        int numberOfBroilers = input.nextInt();
        items.addChickens(numberOfBroilers, "broiler");
    }

    /**
     * Checks user input for how many half ounce gold bars to add to a portfolio and adds them
     *
     * @param items portfolio for the gold bars to be added to
     */
    public static void goldCheck(Portfolio items){
        System.out.println("How many gold bars?");
        int numberOfGold = input.nextInt();
        items.addGold(numberOfGold, 0.5);
    }

    /**
     * Checks user input for how many one ounce silver bars to add to a portfolio and adds them
     *
     * @param items portfolio for the silver bars to be added to
     */
    public static void silverCheck(Portfolio items){
        System.out.println("How many silver bars?");
        int numberOfSilver = input.nextInt();
        items.addSilver(numberOfSilver, 1.0);
    }

    /**
     * main execution method for the lab 4 program
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        Portfolio items = new Portfolio();
        horseCheck(items);
        layerCheck(items);
        broilerCheck(items);
        goldCheck(items);
        silverCheck(items);
        items.printItems();
    }
}
