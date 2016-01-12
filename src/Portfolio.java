
/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */

import edu.msoe.se1021.lab4.WavPlayer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents the farm portfolio as an aggregation of all the farm items. Implements the interface Valuable so the total value can be calculated
 *
 * @author Ian Guswiler
 * @version 1/11/2016
 */
public class Portfolio implements Valuable{
    private static final DecimalFormat valueFormat = new DecimalFormat("#,###.00");
    private ArrayList<FarmItems> items = new ArrayList<>();


    /**
     * Calculates the total value of the portfolio based on the values of the included items
     *
     * @return double representation of the portfolio's value
     */
    public double calculateValue(){
        double calculatedValue = 0;
        for(FarmItems item: items){
            calculatedValue += item.calculateValue();
        }
        return calculatedValue;
    }

    /**
     * Shuffles and prints out each item to the console after calling their toString method as well as playing the
     * appropriate .wav file when an animal comes up. Prints out the total value after all items have been printed
     */
    public void printItems(){
        Collections.shuffle(items);
        for(FarmItems item: items){
            System.out.println(item.toString());
            if(item instanceof Horse){
                WavPlayer.play("neigh.wav");
            }else if(item instanceof Chicken){
                WavPlayer.play("cluck.wav");
            }
        }
        System.out.println("Total Price: $" + valueFormat.format(calculateValue()));
    }

    /**
     * method to add a specified number of horses to the portfolio
     *
     * @param horses number of horses to be added
     */
    public void addHorses(int horses){
        for(int i = 0; i < horses; i++){
            items.add(new Horse());
        }
    }

    /**
     * method to a add a specified number of a specified type of chicken
     *
     * @param chickens number of chickens to be added
     * @param type String representation of the chicken type
     */
    public void addChickens(int chickens, String type){
        for(int i = 0; i < chickens; i++){
            items.add(new Chicken(type));
        }
    }

    /**
     * method to add a specified number of a specified weight gold bar
     *
     * @param goldBars number of gold bars to be added
     * @param weight weight of the gold bars to be added
     */
    public void addGold(int goldBars, double weight){
        for(int i = 0; i < goldBars; i++){
            items.add(new Gold(weight));
        }
    }

    /**
     * method to add a specified number of a specified weight silver bar
     *
     * @param silverBars number of silver bars to be added
     * @param weight weight of the silver bars to be added
     */
    public void addSilver(int silverBars, double weight){
        for(int i = 0; i < silverBars; i++){
            items.add(new Silver(weight));
        }
    }
}
