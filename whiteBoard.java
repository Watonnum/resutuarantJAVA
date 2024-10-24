
public class whiteBoard {

    public static void main(String[] args) {

        Food[] menu = new Food[] {
                new Food("Cabonara Pizza", 30.00, "pizza"),
                new Food("Hawaian Pizza", 30.00, "pizza"),
                new Food("Ham and Cheese Pizza", 30.00, "pizza"),
                new Food("Cabonara Pasta", 10.00, "pasta"),
                new Food("Meetball Pasta", 10.00, "pasta"),
                new Food("Cesar Salad", 7.00, "salad")
        };

        filter(menu, "pizza");

    }

    private static void filter(Food[] arr, String type) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].type.equals(type)) {

                System.out.println(arr[i].name + " ~" + arr[i].price + "$");
            }
        }
    }
}

// credit : https://github.com/woraroj
