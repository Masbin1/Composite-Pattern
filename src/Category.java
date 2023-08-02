import java.util.ArrayList;
import java.util.List;

public class Category implements Component {
    private String name;
    private List<Component> components;

    public Category(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Category: " + name);
        for (Component component : components) {
            component.display();
        }
    }
}
