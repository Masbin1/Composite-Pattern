import java.util.List;

public class ProductItem implements Component {
    private String name;
    private double price;

    public ProductItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void addComponent(Component component) {
        // Tidak berlaku untuk leaf node
    }

    @Override
    public void removeComponent(Component component) {
        // Tidak berlaku untuk leaf node
    }

    @Override
    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}
