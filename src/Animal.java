
/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/11/2016
 */

import java.util.Random;

/**
 * Class extending from the FarmItems class. Lays the base attributes and methods for all farm animals
 *
 * @author Ian Guswiler
 * @version 1/11/2016
 */
public abstract class Animal extends FarmItems{
    protected int age;
    private static final Random generator = new Random();

    /**
     * method to generate and set a random age for an animal
     *
     * @param MAX_AGE integer representation of the maximum age value for an animal
     * @param MIN_AGE integer representation of the maximum age value for an animal
     */
    public void setAge(int MAX_AGE, int MIN_AGE){
        age = generator.nextInt(MAX_AGE - 1) + MIN_AGE;
    }

    /**
     * method to generate and set a random weight for an animal
     *
     * @param MAX_WEIGHT double representation of the maximum weight value for an animal
     * @param MIN_WEIGHT double representation of the minimum weight value for an animal
     */
    public void setWeight(double MAX_WEIGHT, double MIN_WEIGHT){
        weight = MIN_WEIGHT + (generator.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT));
    }


    /**
     * Animal constructor that sets a random weight and age from input ranges
     *
     * @param MAX_AGE integer representation of the maximum age value for an animal
     * @param MIN_AGE integer representation of the maximum age value for an animal
     * @param MAX_WEIGHT double representation of the maximum weight value for an animal
     * @param MIN_WEIGHT double representation of the minimum weight value for an animal
     */
    public Animal(int MAX_AGE, int MIN_AGE, double MAX_WEIGHT, double MIN_WEIGHT){
        setWeight(MAX_WEIGHT, MIN_WEIGHT);
        setAge(MAX_AGE, MIN_AGE);
    }

}
