import java.util.Scanner;

public class rsuRestuarant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] listMenu = { "Fried Rice with Pork", "Stir-fried Basil with Pork",
                    "Omelet with Minced Pork (served with rice)", "Hainanese Chicken Rice",
                    "Roast Pork with Rice",
                    "Rice with Pork Curry", "Clear Soup/Tom Yum Noodles (Pork)", "Small Rice Noodles with Pork",
                    "Egg Noodles with Roast Pork",
                    "Yen Ta Fo (Pink Noodles)", "Fried Meatballs (5 skewers)", "Fried Spring Rolls", "French Fries",
                    "Milk Tea with Tapioca Pearls", "Thai Iced Tea/Iced Green Tea",
                    "Iced Coffee", "Soft Drink (large)", "Bottled Water", "Grass Jelly with Fresh Milk",
                    "Lod Chong in Coconut Milk ", "Coconut Ice Cream" };
            Double[] valueList = { 20.00, 25.00, 30.00, 35.00, 40.00, 45.00, 50.00, 55.00, 60.00, 65.00, 70.00, 75.00,
                    80.00 };

            String[] valueToString = new String[valueList.length]; // array ของ ราคาสินค้า ที่ถูกทำให้เป็น string
            String[] sumationList = new String[(listMenu.length) + (valueList.length)]; // create new
                                                                                        // array[array1+array2] all
                                                                                        // inside of them are String

            markPrice(valueList, valueToString); // valueList[] -> valueToString เปลี่ยน int เป็น

            System.arraycopy(listMenu, 0, sumationList, 0, listMenu.length);
            System.arraycopy(valueToString, 0, sumationList, listMenu.length, valueToString.length);
            // string ในแต่ละสมาชิกของ array1 และ array2 เอามารวมเป็น array3 เดียวกัน

            System.out.println("-----------");

            System.out.println(
                    "========================================================================================================================================================================================================");

            System.out.println("");
            System.out.println("Welcome to RSU's resturant.");
            System.out.println("");
            System.out.println("Let me intoduce our orders.");
            System.out.println("");

            for (String str : sumationList) {

            }
        }
    }

    private static void markPrice(Double[] valueList, String[] valueToString) {
        for (int i = 0; i < valueList.length; i++) {
            valueToString[i] = String.valueOf(valueList[i]);
        }

    }

}
