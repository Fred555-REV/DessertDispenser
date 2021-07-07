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


        System.out.println("left scoops: " + left.scoops);
        System.out.println("right scoops: " + right.scoops);
        System.out.println("sugar cones left: " + waffleCone.amount);
        System.out.println("waffle cones left: " + sugarCone.amount);
        System.out.println("oreo spoonfuls left: " + oreo.amount);

        System.out.println();

        IceCreamMachine.coneDispenser(waffleCone);
        IceCreamMachine.toppingDispenser(oreo, 2);
        IceCreamMachine.leftLever(left, 1);
        IceCreamMachine.coneDispenser(sugarCone);
        IceCreamMachine.toppingDispenser(oreo, 2);
        IceCreamMachine.leftLever(left, 3);
        IceCreamMachine.midLever(left, right, 40);

        System.out.println();

        System.out.println("left scoops: " + left.scoops);
        System.out.println("right scoops: " + right.scoops);
        System.out.println("sugar cones left: " + waffleCone.amount);
        System.out.println("waffle cones left: " + sugarCone.amount);
        System.out.println("oreo spoonfuls left: " + oreo.amount);

        System.out.println();

        IceCreamMachine.fillLeft(left);
        IceCreamMachine.refillToppings(oreo);
        IceCreamMachine.refillContainers(waffleCone);

        System.out.println();

        System.out.println("left scoops: " + left.scoops);
        System.out.println("right scoops: " + right.scoops);
        System.out.println("sugar cones left: " + waffleCone.amount);
        System.out.println("waffle cones left: " + sugarCone.amount);
        System.out.println("oreo spoonfuls left: " + oreo.amount);

    }
}
