
/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */

import edu.msoe.se1021.lab4.MetalsPricing;

/**
 * Class extending the FarmItems class represents a gold bar with a specified weight and calculated value
 *
 * @author Ian Guswiler
 * @version 1/11/2016
 */
public class Gold extends FarmItems{
    private final String ounceWeight;

    /**
     * Gold constructor that sets the item weight and value based off of the value calculation.
     * Also sets the String representation of the weight value
     *
     * @param weight weight in ounces of the gold bar to be created
     */
    public Gold(double weight){
        setWeight(weight);
        setValue(calculateValue());
        if(weight == 0.5){
            ounceWeight = "half";
        }else{
            ounceWeight = "" + weight;
        }
    }


    /**
     * Calculates the value of the gold bar based on the set weight and reported online price per ounce
     *
     * @return total calculated value of the gold bar in USD
     */
    public double calculateValue(){
        return MetalsPricing.getGoldPrice() * weight;
    }

    /**
     * Returns the gold bar's information in a specified String format
     *
     * @return String of the gold bar's information in the format $(value) for a (ounceWeight) ounce American Gold Eagle
     */
    public String toString(){
        return "$" + getValue() + " for a " + ounceWeight + " ounce American Gold Eagle";
    }
}
