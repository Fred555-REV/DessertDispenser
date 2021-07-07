package DessertDispenser;

import java.util.ArrayList;
import java.util.List;

public class IceCreamMachine {
    public static double cost;
    public static List<Double> orderList = new ArrayList<>();

    public void createNewOrder() {
        cost = 0;
    }

    public void endOrder() {
        orderList.add(cost);
    }

    public static void fillLeft(IceCream iceCream) {
        iceCream.scoops = 50;
    }

    public static void fillRight(IceCream iceCream) {
        iceCream.scoops = 50;
    }

    public static void fillContainerDispenser(Container container) {

    }

    public static void fillToppingDispenser(Topping topping) {

    }

    public static void leftLever(int scoops) {
    }

    public static void midLever(int scoops) {

    }

    public static void rightLever(int scoops) {

    }

    public static void coneDispenser(int amount) {

    }

}
