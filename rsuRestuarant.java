import java.util.ArrayList;
import java.util.Scanner;

public class rsuRestuarant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Food[] list = { // base data
                    new Food("Fried Rice with Pork", 45.00, "main"),
                    new Food("Stir-fried Basil with Pork", 55.00, "main"),
                    new Food("Omelet with Minced Pork (served with rice)", 40.00, "main"),
                    new Food("Hainanese Chicken Rice", 50.00, "main"),
                    new Food("Roast Pork with Rice", 50.00, "main"),
                    new Food("Rice with Pork Curry", 60.00, "main"),
                    new Food("Clear Soup/Tom Yum Noodles (Pork)", 40.00, "noodle"),
                    new Food("Small Rice Noodles with Pork", 40.00, "noodle"),
                    new Food("Egg Noodles with Roast Pork", 45.00, "noodle"),
                    new Food("Yen Ta Fo (Pink Noodles)", 45.00, "noodle"),
                    new Food("Fried Meatballs (5 skewers)", 20.00, "snack"),
                    new Food("Fried Spring Rolls", 30.00, "snack"),
                    new Food("French Fries", 25.00, "snack"),
                    new Food("Milk Tea with Tapioca Pearls", 15.00, "drink"),
                    new Food("Thai Iced Tea/Iced Green Tea", 15.00, "drink"),
                    new Food("Iced Coffee", 25.00, "drink"),
                    new Food("Soft Drink (large)", 25.00, "drink"),
                    new Food("Bottled Water", 10.00, "drink"),
                    new Food("Grass Jelly with Fresh Milk", 20.00, "dessert"),
                    new Food("Lod Chong in Coconut Milk", 17.00, "dessert"),
                    new Food("Coconut Ice Cream", 12.00, "dessert"),
            }; // storage an object

            // display
            System.out.println("Main dished");
            System.out.println("-----------");
            System.out.println("");

            filTer(list, "main");

            System.out.println("");
            System.out.println("Noodle");
            System.out.println("------");
            System.out.println("");

            filTer(list, "noodle");

            System.out.println("");
            System.out.println("Snacks");
            System.out.println("------");
            System.out.println("");

            filTer(list, "snack");

            System.out.println("");
            System.out.println("Drinks & Juice");
            System.out.println("--------------");
            System.out.println("");

            filTer(list, "drink");

            System.out.println("");
            System.out.println("Dessert");
            System.out.println("-------");
            System.out.println("");

            filTer(list, "dessert");

            System.out.println("");
            System.out.println("Pick any your choice.");
            System.out.println("");
            // end this play

            ArrayList<Integer> userChoice = new ArrayList<>(); // create arr of input user.
            infiniteCheck(sc, userChoice);// call method loop check operation

            checkUserList(userChoice, list);

            System.out.println("total " + userChoice.size() + " orders.");
        } // sc.close
    }// end main

    private static void filTer(Food[] arr, String type) { // filter type of dished to display
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].type.equals(type)) {
                System.out.println(String.format("%4s%-50s %s", (i + 1) + ". ", arr[i].name, arr[i].price));
            }
        }
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

        System.out.println("---------");
    }

    private static void checkUserList(ArrayList<Integer> userChoice, Food[] list) {

        System.out.println("total " + (userChoice.size() - 1) + " orders.");
        System.out.println("");

        userChoice.forEach((e) -> {
            int data = e - 1;
            if (data < 0) {
                System.err.println("---------------------");
                System.err.println("Anything else ? (y/n)");
                System.out.println("");
            } else if (data > list.length) {
                System.out.println(data + " Mistmatch, please check our list.");
            } else {
                System.out.println(list[data]);
            }

        });
    }
}