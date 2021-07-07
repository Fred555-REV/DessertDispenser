package DessertDispenser;

public class Container {
    String containerType; // sugar cone, waffle cone, cake cone
    String coneDip;
    int amount;

    public Container(String containerType, String coneDip) {
        this.containerType = containerType;
        this.coneDip = coneDip;
        this.amount = 100;
    }
}
