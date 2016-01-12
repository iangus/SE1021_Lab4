import edu.msoe.se1021.lab4.MetalsPricing;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Silver extends FarmItems{
    private final String ounceWeight;


    /**
     * Silver constructor that sets the item weight and value based off of the value calculation.
     * Also sets the String representation of the weight value
     *
     * @param weight weight in ounces of the silver bar to be created
     */
    public Silver(double weight){
        setWeight(weight);
        setValue(calculateValue());
        if(weight == 1.0){
            ounceWeight = "one";
        }else{
            ounceWeight = "" + weight;
        }
    }

    /**
     * Calculates the value of the silver bar based on the set weight and reported online price per ounce
     *
     * @return total calculated value of the silver bar in USD
     */
    public double calculateValue(){
        return MetalsPricing.getSilverPrice() * weight;
    }

    /**
     * Returns the silver bar's information in a specified String format
     *
     * @return String of the silver bar's information in the format $(value) for a (ounceWeight) ounce silver bar
     */
    public String toString(){
        return "$" + getValue() + " for a " + ounceWeight + " ounce silver bar";
    }
}
