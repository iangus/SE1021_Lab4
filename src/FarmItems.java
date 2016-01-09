/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/7/2016
 */
public abstract class FarmItems implements Valuable {
    private int weight;
    private double value;

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setValue(double value){
        this.value = value;
    }
}
