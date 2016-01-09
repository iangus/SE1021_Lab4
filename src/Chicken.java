import java.util.Random;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Chicken extends FarmItems {
    private int age;
    private static final int MAX_AGE = 8;
    private static final int MIN_AGE = 0;
    private static final double MAX_WEIGHT = 6.5;
    private static final double MIN_WEIGHT = 2.5;
    private static final Random generator = new Random();
    private final String type;

    public Chicken(String type){
        this.type = type;
        setAge();
        setWeight();
        setValue(calculateValue());
    }


    public void setAge(){
        age = generator.nextInt(MAX_AGE - 1) + MIN_AGE;
    }

    public void setWeight(){
        weight = MIN_WEIGHT + (generator.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT));
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
