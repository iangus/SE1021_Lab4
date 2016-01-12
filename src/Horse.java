
/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/7/2016
 */

/**
 * Class extending the Animal class represents a horse
 *
 * @author Ian Guswiler
 * @version 1/11/2016
 */
public class Horse extends Animal {
    private static final int MAX_AGE = 25;
    private static final int MIN_AGE = 2;
    private static final double MAX_WEIGHT = 1500;
    private static final double MIN_WEIGHT = 500;


    /**
     * Horse constructor that uses the Animal constructor to set the weight and age while also setting the value
     */
    public Horse(){
        super(MAX_AGE, MIN_AGE, MAX_WEIGHT, MIN_WEIGHT);
        setValue(calculateValue());
    }

    /**
     * Calculates the value of a horse based on its weight and age
     *
     * @return the calculated double value for the horse
     */
    public double calculateValue(){
        double calculatedValue;
        if(age!=0 && (double)age/MAX_AGE <.9){
            calculatedValue = 1000 * (100 - (double)age/MAX_AGE * 100);
        } else{
            calculatedValue = 0.28 * weight;
        }

        return calculatedValue;
    }

    /**
     * Returns the horse's information in a specified String format
     *
     * @return String of the horse's information in the format $(value) for A (age) year old horse weighing (weight) pounds
     */
    public String toString(){
        return "$" + getValue() + " for A " + age + " year old horse weighing " + getWeight() + " pounds";
    }
}
