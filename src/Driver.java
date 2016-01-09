import edu.msoe.se1021.lab4.WavPlayer;

/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Driver {
    public static void main(String[] args) {
        Portfolio items = new Portfolio();
        items.addHorses(4);
        items.addChickens(3, "broiler");
        items.addChickens(2, "egg layer");
        items.addGold(4, 0.5);
        items.addSilver(6, 1.0);
        items.printItems();
    }
}
