
import java.util.ArrayList;
import java.util.Scanner;

public class restaurants {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] mainDishes = { "Fried Rice with Pork", "Stir-fried Basil with Pork",
                    "Omelet with Minced Pork (served with rice)", "Hainanese Chicken Rice",
                    "Roast Pork with Rice",
                    "Rice with Pork Curry" }; // 6 orders (1 - 6) // arr[0] - arr[5]
            double[] mainDishesValue = { 45, 55, 40, 50, 50, 60 }; // 6 value
            String[] noodle = { "Clear Soup/Tom Yum Noodles (Pork)", "Small Rice Noodles with Pork",
                    "Egg Noodles with Roast Pork",
                    "Yen Ta Fo (Pink Noodles)"
            }; // 4 orders (7 - 10) arr[6] - arr[9]
            Double[] noodleValue = { 40.00, 40.00, 45.00, 40.00, }; // 4 value
            String[] snacks = { "Fried Meatballs (5 skewers)", "Fried Spring Rolls", "French Fries" }; // 3 orders (11 -
                                                                                                       // 13)
                                                                                                       // arr[10]
                                                                                                       // -
                                                                                                       // arr[12]
            Double[] snacksValue = { 20.00, 30.00, 25.00 }; // 3 value
            String[] drinks = { "Milk Tea with Tapioca Pearls", "Thai Iced Tea/Iced Green Tea",
                    "Iced Coffee", "Soft Drink (large)", "Bottled Water" }; // 5 orders (14 - 18) // arr[13] - arr[17]
            Double[] drinksValue = { 15.00, 25.00, 25.00, 25.00, 10.00 }; // 5 value
            String[] dessert = { "Grass Jelly with Fresh Milk", "Lod Chong in Coconut Milk ", "Coconut Ice Cream" }; // 3
                                                                                                                     // orders
                                                                                                                     // (19
                                                                                                                     // -
                                                                                                                     // 21)
                                                                                                                     //
                                                                                                                     // arr[18]
                                                                                                                     // -
                                                                                                                     // arr[20]
            Double[] dessertValue = { 20.00, 17.00, 12.00 }; // 3 value

            ArrayList<Integer> userChoice = new ArrayList<>();

            System.out.println(
                    "========================================================================================================================================================================================================");

            System.out.println("");
            System.out.println("Welcome to RSU's resturant.");
            System.out.println("");
            System.out.println("Let me intoduce our orders.");
            System.out.println("");

            menuList(mainDishes, mainDishesValue, noodle, noodleValue, snacks, snacksValue, drinks,
                    drinksValue, dessert, dessertValue); // display all menu

            System.out.println("");
            System.out.println("Choose your any choice. (Expand your terminal for fully feeling)");
            System.out.println("");
            System.out.println("");
            System.out.println("---------------");

            infiniteCheck(sc, userChoice); // loop รับค่าจาก user to stored in ArrayList

            System.out.println("---------------");

            checkUserList(userChoice, mainDishes, mainDishesValue, noodle, noodleValue, snacks, snacksValue, drinks,
                    drinksValue, dessert, dessertValue); // display menulist of arraylist userChoice

        } // sc.close()
    } // end main

    private static void checkUserList(
            ArrayList<Integer> userChoice,
            String[] mainDishes,
            double[] mainDishesValue,
            String[] noodle,
            Double[] noodleValue,
            String[] snacks,
            Double[] snacksValue,
            String[] drinks,
            Double[] drinksValue,
            String[] dessert,
            Double[] dessertValue) {
        userChoice.forEach((e) -> {
            int data = e - 1;
            if (data < 0) {
                System.err.println("");
                System.err.println("Anything else ? (y/n)");
                System.out.println("==========");
            } else if (data < 6) {
                System.out.println(String.format("%-60s %s", mainDishes[data], mainDishesValue[data]));
            } else if (data < 10) {
                System.out.println(String.format("%-60s %s", noodle[data - 6], noodleValue[data - 6]));
            } else if (data < 13) {
                System.out.println(String.format("%-60s %s", snacks[data - 10], snacksValue[data - 10]));
            } else if (data < 18) {
                System.out.println(String.format("%-60s %s", drinks[data - 13], drinksValue[data - 13]));
            } else if (data < 21) {
                System.out.println(String.format("%-60s %s", dessert[data - 18], dessertValue[data - 18]));
            }
        });
    }

    private static void infiniteCheck(Scanner sc, ArrayList<Integer> userChoice) {

        boolean keepDoing = true; // on/off operator

        while (keepDoing) {
            int user = sc.nextInt(); // รับค่าจาก user ที่ต้องการเลือก menu
            if (user == 0) {
                keepDoing = false;
            }
            userChoice.add(user);
        } // 0 หยุดการทำงาน
    }

    private static void menuList(
            String[] mainDishes,
            double[] mainDishesValue,
            String[] noodle,
            Double[] noodleValue,
            String[] snacks,
            Double[] snacksValue,
            String[] drinks,
            Double[] drinksValue,
            String[] dessert,
            Double[] dessertValue) { // Menu

        System.out.println("Main Dishes");
        System.out.println("-----------");

        for (int i = 0; i < mainDishes.length; i++) { // จานหลัก

            System.out.println(String.format("%-3s %-60s %s", (i + 1) + ".", mainDishes[i], mainDishesValue[i]));

        }

        System.out.println("================================================================="); // 65space
        System.out.println("");
        System.out.println("Noodles");
        System.out.println("-------");
        for (int j = 0; j < noodle.length; j++) {// ก๋วยเตี๋ยว
            System.out.println(String.format("%-3s %-60s %s", (j + 7) + ".", noodle[j], noodleValue[j]));
        }

        System.out.println("=================================================================");
        System.out.println("");
        System.out.println("Snacks");
        System.out.println("------");
        for (int k = 0; k < snacks.length; k++) { // ของทานแดกเล่น
            System.out.println(String.format("%-3s %-60s %s", (k + 11) + ".", snacks[k], snacksValue[k]));
        }

        System.out.println("=================================================================");
        System.out.println("");
        System.out.println("Drinks");
        System.out.println("------");
        for (int l = 0; l < drinks.length; l++) { // เครื่องดื่ม
            System.out.println(String.format("%-3s %-60s %s", (l + 14) + ".", drinks[l], drinksValue[l]));
        }

        System.out.println("=================================================================");
        System.out.println("");
        System.out.println("Dessert");
        System.out.println("-------");
        for (int h = 0; h < dessert.length; h++) { // ของหวาน
            System.out.println(String.format("%-3s %-60s %s", (h + 19) + ".", dessert[h], dessertValue[h]));
        }
        System.out.println(
                "========================================================================================================================================================================================================");
    }

}