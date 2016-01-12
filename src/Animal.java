import java.util.Random;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/11/2016
 */
public abstract class Animal extends FarmItems{
    protected int age;
    private static final Random generator = new Random();

    public void setAge(int MAX_AGE, int MIN_AGE){
        age = generator.nextInt(MAX_AGE - 1) + MIN_AGE;
    }

    public void setWeight(double MAX_WEIGHT, double MIN_WEIGHT){
        weight = MIN_WEIGHT + (generator.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT));
    }


    public Animal(int MAX_AGE, int MIN_AGE, double MAX_WEIGHT, double MIN_WEIGHT){
        setWeight(MAX_WEIGHT, MIN_WEIGHT);
        setAge(MAX_AGE, MIN_AGE);
    }

}
