public class Main {
    public static void main(String[] args) {
        // Create individual products
        ProductItem laptop = new ProductItem("Laptop", 1200);
        ProductItem smartphone = new ProductItem("Smartphone", 900);

        // Create categories and add products to categories
        Category categoryElectronics = new Category("Electronics");
        categoryElectronics.addComponent(laptop);
        categoryElectronics.addComponent(smartphone);

        Category categoryComputerAccessories = new Category("Computer Accessories");
        categoryComputerAccessories.addComponent(new ProductItem("Keyboard", 50));
        categoryComputerAccessories.addComponent(new ProductItem("Mouse", 30));

        // Create root category and add other categories to it
        Category rootCategory = new Category("Root Category");
        rootCategory.addComponent(categoryElectronics);
        rootCategory.addComponent(categoryComputerAccessories);

        // Display the product structure
        rootCategory.display();
    }
}
