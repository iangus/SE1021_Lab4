package edu.msoe.se1021.lab4;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Utility class that fetches the gold and silver prices (per once) from the
 * Coinabul live price feed.
 * @author t a y l o r@msoe.edu
 * @version 2015.12.17_1
 */
public class MetalsPricing {

    /**
     * Current price in USD for one once of gold.
     */
    private static double goldPrice;

    /**
     * Current price in USD for one once of silver.
     */
    private static double silverPrice;

    /**
     * Flag to determine if the gold and silver prices have been set for this class.
     */
    private static boolean initialized = false;

    /**
     * Constructor that is declare as private since client code should not make
     * objects from this class.
     * <br>
     * The constructor is used to initialize the goldPrice and silverPrice
     * attributes if they have not been initialized yet.  The constructor
     * should only be called once (when initialized is false.
     */
    private MetalsPricing() {
        if(!initialized) {
            initialized = true;
            // Fool web server into thinking we are a browser
            System.setProperty("http.agent", "Mozilla/5.0");
            URL url;
            try {
                url = new URL("http://coinabul.com/api.php");
                try (Scanner in = new Scanner(url.openStream())) {
                    String json = in.nextLine();
                    int goldIndex = json.indexOf("Gold") + 14;
                    goldPrice = Double.parseDouble(json.substring(goldIndex, goldIndex + 17));
                    int silverIndex = json.indexOf("\"Silver\"") + 17;
                    silverPrice = Double.parseDouble(json.substring(silverIndex, silverIndex + 15));
                }
            } catch (IOException e) {
                // Problem with website, set default values
                goldPrice = 1230.70;
                silverPrice = 17.43;
                System.err.println("Using default values for precious metals pricing");
            }
        }
    }

    /**
     * Returns the current price for one once of gold in USD
     * @return current price of gold
     */
    public static double getGoldPrice() {
        if(!initialized) {
            new MetalsPricing();
        }
        return goldPrice;
    }

    /**
     * Returns the current price for one once of silver in USD
     * @return current price of silver
     */
    public static double getSilverPrice() {
        if(!initialized) {
            new MetalsPricing();
        }
        return silverPrice;
    }
}