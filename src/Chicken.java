

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Chicken extends Animal {
    private static final int MAX_AGE = 8;
    private static final int MIN_AGE = 0;
    private static final double MAX_WEIGHT = 6.5;
    private static final double MIN_WEIGHT = 2.5;
    private final String type;

    public Chicken(String type){
        super(MAX_AGE, MIN_AGE, MAX_WEIGHT, MIN_WEIGHT);
        this.type = type;
        setValue(calculateValue());
    }


    public double calculateValue(){
        double calculatedValue;
        switch(type){
            case "broiler":
                calculatedValue = 1.04 * weight;
                break;
            case "egg layer":
                calculatedValue = 3.0 * (MAX_AGE - age);
                break;
            default:
                calculatedValue = 0;
                break;
        }

        return calculatedValue;
    }

    public String toString(){
        return "$" + getValue() + " for A " + age + " year old, " + type + " weighing " + getWeight() + " pounds";
    }
}
