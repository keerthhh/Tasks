import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "PENCIL", 10.0));
        productList.add(new Product(2, "RULER", 15.0));
        productList.add(new Product(3, "PEN", 20.0));

        double totalPrice = calculateTotalPrice(productList);
        System.out.println("PENCIL = 10");
        System.out.println("RULER = 15");
        System.out.println("PEN = 20");
        System.out.println("Total Price of Product = " + totalPrice);
    }

    public static double calculateTotalPrice(List<Product> products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
