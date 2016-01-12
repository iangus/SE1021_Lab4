import edu.msoe.se1021.lab4.WavPlayer;

import java.util.Scanner;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Driver {
    private static Scanner input = new Scanner(System.in);

    public static void horseCheck(Portfolio items){
        System.out.println("How many horses?");
        int numberOfHorses = input.nextInt();
        items.addHorses(numberOfHorses);
    }

    public static void layerCheck(Portfolio items){
        System.out.println("How many egg laying chickens?");
        int numberOfLayers = input.nextInt();
        items.addChickens(numberOfLayers, "egg layer");
    }

    public static void broilerCheck(Portfolio items){
        System.out.println("How many broiler chickens?");
        int numberOfBroilers = input.nextInt();
        items.addChickens(numberOfBroilers, "broiler");
    }

    public static void goldCheck(Portfolio items){
        System.out.println("How many gold bars?");
        int numberOfGold = input.nextInt();
        items.addGold(numberOfGold, 0.5);
    }

    public static void silverCheck(Portfolio items){
        System.out.println("How many silver bars?");
        int numberOfSilver = input.nextInt();
        items.addSilver(numberOfSilver, 1.0);
    }

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
