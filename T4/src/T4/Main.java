package T4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
 
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "First", 12.5));
        productList.add(new Product(2, "Second", 18.0));
        productList.add(new Product(3, "Third", 22.0));
        productList.add(new Product(4, "Fourth", 27.78));
     
        double totalPrice = calculateTotalPrice(productList);

        System.out.println("Total Price: " + totalPrice);
    }

    public static double calculateTotalPrice(List<Product> products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice = totalPrice + product.getPrice();
        }
        return totalPrice;
    }
}
