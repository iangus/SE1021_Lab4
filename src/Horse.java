/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/7/2016
 */

import edu.msoe.se1021.lab4.WavPlayer;

public class Horse extends FarmItems {
    private int age;
    private static final int MAX_AGE = 25;

    public void setAge(int age){
        this.age = age;
    }

    public double calculateValue(){
        double calculatedValue;
        if(age!=0 && age * 1.0/MAX_AGE <.9){
            calculatedValue = 1000.0 * (100 - (float)age/MAX_AGE * 100);
        } else{
            calculatedValue = 0.28 * getWeight();
        }

        return calculatedValue;
    }

    public Horse(){
        setWeight();
        setAge();
        setValue(calculateValue());
    }
}
