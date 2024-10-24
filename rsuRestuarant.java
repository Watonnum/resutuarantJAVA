import java.util.Scanner;

public class rsuRestuarant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // String[] listMenu = { "Fried Rice with Pork", "Stir-fried Basil with Pork",
            // "Omelet with Minced Pork (served with rice)", "Hainanese Chicken Rice",
            // "Roast Pork with Rice",
            // "Rice with Pork Curry", "Clear Soup/Tom Yum Noodles (Pork)", "Small Rice
            // Noodles with Pork",
            // "Egg Noodles with Roast Pork",
            // "Yen Ta Fo (Pink Noodles)", "Fried Meatballs (5 skewers)", "Fried Spring
            // Rolls", "French Fries",
            // "Milk Tea with Tapioca Pearls", "Thai Iced Tea/Iced Green Tea",
            // "Iced Coffee", "Soft Drink (large)", "Bottled Water", "Grass Jelly with Fresh
            // Milk",
            // "Lod Chong in Coconut Milk ", "Coconut Ice Cream" };
            // Double[] valueList = { 20.00, 25.00, 30.00, 35.00, 40.00, 45.00, 50.00,
            // 55.00, 60.00, 65.00, 70.00, 75.00,
            // 80.00 };

            Food[] menu = new Food[1];

            // Food food1 = new Food("pizza", 20.00);
            // Food food2 = new Food("pizza", 20.00);
            // Food food3 = new Food("pizza", 20.00);

            // menu[0] = food1;

            Food pizza = new Food("pizza", 20.00);
            Food hamburger = new Food("hamburger", 8.00);
            Food salad = new Food("salad", 3.00);

            menu[0] = pizza;
            menu[1] = hamburger;
            menu[2] = salad;

            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i].name);
            }

        }
    }

    // public String toString() {
    // // return getClass().getSimpleName() + "[name=" + name + "]";
    // return getClass().getName() + "@" + Integer.toHexString(hashCode());
    // }
}
