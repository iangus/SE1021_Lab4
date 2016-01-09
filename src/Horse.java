import java.util.Random;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/7/2016
 */


public class Horse extends FarmItems {
    private int age;
    private static final int MAX_AGE = 25;
    private static final int MIN_AGE = 2;
    private static final double MAX_WEIGHT = 1500;
    private static final double MIN_WEIGHT = 500;
    private static final Random generator = new Random();

    public void setAge(){
        age = generator.nextInt(MAX_AGE - 1) + MIN_AGE;
    }

    public void setWeight(){
        weight = MIN_WEIGHT + (generator.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT));
    }

    public double calculateValue(){
        double calculatedValue;
        if(age!=0 && (double)age/MAX_AGE <.9){
            calculatedValue = 1000 * (100 - (double)age/MAX_AGE * 100);
        } else{
            calculatedValue = 0.28 * weight;
        }

        return calculatedValue;
    }

    public Horse(){
        setWeight();
        setAge();
        setValue(calculateValue());
    }

    public String toString(){
        return "$" + getValue() + " for A " + age + " year old horse weighing " + getWeight() + " pounds";
    }
}
