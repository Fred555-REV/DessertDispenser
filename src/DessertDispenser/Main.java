package DessertDispenser;

public class Main {

    public static void main(String[] args) {
        // write your code here
        IceCream left = new IceCream("chocolate", true);
        IceCream right = new IceCream("vanilla", true);
        Topping oreo = new Topping("Oreo");
        Topping sprinkles = new Topping("Sprinkles");
        Container waffleCone = new Container("waffle cone", "none");
        Container sugarCone = new Container("sugar cone", "chocolate");
//        IceCreamMachine.fillLeft(left);
//        IceCreamMachine.refillToppings(oreo);
//        IceCreamMachine.refillContainers(waffleCone);
        IceCreamMachine.coneDispenser(waffleCone);
        IceCreamMachine.toppingDispenser(oreo, 2);
        IceCreamMachine.leftLever(left, 1);

    }
}
