/**
 * SE1021 - 032
 * Winter 2016
 * Lab
 * Name: Ian Guswiler
 * Created: 1/9/2016
 */
public class Driver {
    public static void main(String[] args) {
        Horse test = new Horse();
        System.out.println(test.toString());
        Chicken test2 = new Chicken("egg layer");
        System.out.println(test2.toString());
        Gold test3 = new Gold(0.5);
        System.out.println(test3.toString());
        Silver test4 = new Silver(1.0);
        System.out.println(test4.toString());
    }
}
