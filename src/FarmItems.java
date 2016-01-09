import java.text.DecimalFormat;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/7/2016
 */
public abstract class FarmItems implements Valuable {
    protected double weight;
    protected double value;
    private static final DecimalFormat valueWeightFormat = new DecimalFormat("#,###.00");

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return valueWeightFormat.format(weight);
    }

    public String getValue(){
        return valueWeightFormat.format(value);
    }

    public void setValue(double value){
        this.value = value;
    }
}
