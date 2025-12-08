public class ShoppingCart1DArrays {
    public static void main(String[] args) {
        int prices[] = {120, 80, 150, 60, 200, 90};
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
            System.out.println("Item: " + prices[i] );
        }
        System.out.println("Total price: " + sum);
    }
}