import edu.msoe.se1021.lab4.MetalsPricing;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Gold extends FarmItems{
    private final String ounceWeight;

    public Gold(double weight){
        setWeight(weight);
        setValue(calculateValue());
        if(weight == 0.5){
            ounceWeight = "half";
        }else{
            ounceWeight = "" + weight;
        }
    }

    public double calculateValue(){
        return MetalsPricing.getGoldPrice() * weight;
    }

    public String toString(){
        return "$" + getValue() + " for a " + ounceWeight + " ounce American Gold Eagle";
    }
}
