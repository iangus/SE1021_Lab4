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

    public Silver(double weight){
        setWeight(weight);
        setValue(calculateValue());
        if(weight == 1.0){
            ounceWeight = "one";
        }else{
            ounceWeight = "" + weight;
        }
    }

    public double calculateValue(){
        return MetalsPricing.getSilverPrice() * weight;
    }

    public String toString(){
        return "$" + getValue() + " for a " + ounceWeight + " ounce silver bar";
    }
}
