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

    public static void refillContainers(Container container) {
        container.amount = 100;
    }

    public static void refillToppings(Topping topping) {
        topping.amount = 25;
    }

    public static void coneDispenser(Container container, int amount) {
        if (amount > container.amount) {
            System.out.println();
        }
    }

    public static void leftLever(IceCream left, int scoops) {
        if (scoops > left.scoops) {
            System.out.println(left.scoops + " scoops of " + left.flavor + " ice cream dispensed.");
        } else {
            System.out.println("Not enough Ice Cream please refill");
        }
    }

    public static void midLever(IceCream left, IceCream right, int scoops) {
        if (scoops > (left.scoops / 2) + (right.scoops / 2)) {
            System.out.println(scoops + " scoops of " + left.flavor + " and " + right.flavor + " swirl ice cream");
        }
    }

    public static void rightLever(IceCream right, int scoops) {
        if (scoops > right.scoops) {
            System.out.println(right.scoops + " scoops of " + right.flavor + " ice cream dispensed.");
        } else {
            System.out.println("Not enough Ice Cream please refill");
        }
    }


}
