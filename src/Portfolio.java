import edu.msoe.se1021.lab4.WavPlayer;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Portfolio implements Valuable{
    private static final DecimalFormat valueFormat = new DecimalFormat("#,###.00");
    private ArrayList<FarmItems> items = new ArrayList<>();

    public double calculateValue(){
        double calculatedValue = 0;
        for(FarmItems item: items){
            calculatedValue += item.calculateValue();
        }
        return calculatedValue;
    }

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

    public void addHorses(int horses){
        for(int i = 0; i < horses; i++){
            items.add(new Horse());
        }
    }

    public void addChickens(int chickens, String type){
        for(int i = 0; i < chickens; i++){
            items.add(new Chicken(type));
        }
    }

    public void addGold(int goldBars, double weight){
        for(int i = 0; i < goldBars; i++){
            items.add(new Gold(weight));
        }
    }

    public void addSilver(int silverBars, double weight){
        for(int i = 0; i < silverBars; i++){
            items.add(new Silver(weight));
        }
    }
}
