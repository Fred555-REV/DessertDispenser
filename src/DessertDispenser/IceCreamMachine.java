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

    public static void coneDispenser(Container container) {
        if (1 <= container.amount) {
            if (container.coneDip.equalsIgnoreCase("none")) {
                System.out.println(container.containerType + " dispensed.");
                container.amount--;

            } else {
                System.out.println(container.containerType + " with " + container.coneDip + " dip dispensed.");
                container.amount--;
            }
        } else {
            System.out.println("Not enough cones, please refill.");
        }
    }

    public static void toppingDispenser(Topping topping, int amount) {
        if (amount <= topping.amount) {
            if (amount == 1) {
                System.out.println(amount + " spoon of " + topping.topping + " dispensed.");
            } else {
                System.out.println(amount + " spoons of " + topping.topping + " dispensed.");
            }
            topping.amount -= amount;
        } else {
            System.out.println("Not enough " + topping.topping + " toppings, please refill");
        }
    }

    public static void leftLever(IceCream left, double scoops) {
        if (scoops <= left.scoops) {
            if (scoops == 1) {
                System.out.println(scoops + " scoop of " + left.flavor + " ice cream dispensed.");
            } else {
                System.out.println(scoops + " scoops of " + left.flavor + " ice cream dispensed.");
            }
            left.scoops -= scoops;
        } else {
            System.out.println("Not enough " + left.flavor + " Ice Cream, please refill.");
        }
    }

    public static void midLever(IceCream left, IceCream right, double scoops) {
        if (scoops <= (left.scoops / 2) + (right.scoops / 2)) {
            if (scoops == 1) {
                System.out.println(scoops + " scoop of " + left.flavor + " and " + right.flavor + " swirl ice cream");
            } else {
                System.out.println(scoops + " scoops of " + left.flavor + " and " + right.flavor + " swirl ice cream");
            }
            left.scoops -= (scoops / 2);
            right.scoops -= (scoops / 2);
        } else {
            System.out.println("Not enough " + left.flavor + " and " + right.flavor + " Ice Cream, please refill.");
        }
    }

    public static void rightLever(IceCream right, double scoops) {
        if (scoops <= right.scoops) {
            if (scoops == 1) {
                System.out.println(scoops + " scoop of " + right.flavor + " ice cream dispensed.");
            } else {
                System.out.println(scoops + " scoops of " + right.flavor + " ice cream dispensed.");
            }
            right.scoops -= scoops;
        } else {
            System.out.println("Not enough " + right.flavor + " Ice Cream, please refill.");
        }
    }

    public static void displayIceCream(int scoops, int cone) {
        System.out.println("Your final order comes to");
    }
}
