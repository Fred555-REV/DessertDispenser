package DessertDispenser;

public class Container {
    String containerType; // sugar cone, waffle cone, cake cone
    String coneDip;
    String containerSize;
    int amount;

    public Container(String containerType, String coneDip, String containerSize, int amount) {
        this.containerType = containerType;
        this.coneDip = coneDip;
        this.containerSize = containerSize;
        this.amount = amount;
    }
}
