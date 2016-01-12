
/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/7/2016
 */

import java.text.DecimalFormat;

/**
 * Base class for any farm items. Implements the Valuable interface to be used in lower classes
 *
 * @author Ian Guswiler
 * @version 1/11/2016
 */
public abstract class FarmItems implements Valuable {
    protected double weight;
    protected double value;
    private static final DecimalFormat valueWeightFormat = new DecimalFormat("#,###.00");


    /**
     * Sets the weight of the farm item
     *
     * @param weight double representation of the weight value that is to be set for the farm item
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    /**
     * gets the set weight for the farm item and returns it in a specified form
     *
     * @return formatted farm item weight. In the form #,###.00
     */
    public String getWeight(){
        return valueWeightFormat.format(weight);
    }

    /**
     * gets the set monetary value for the farm item and returns it in a specified form
     *
     * @return formatted farm item value. In the form #,###.00
     */
    public String getValue(){
        return valueWeightFormat.format(value);
    }

    /**
     * Sets the monetary value of the farm item
     *
     * @param value double representation of the monetary value that is to be set for the farm item
     */
    public void setValue(double value){
        this.value = value;
    }
}
