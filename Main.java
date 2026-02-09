package BMS;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ProductService productService = new ProductService();
        BillingService billingService = new BillingService();
        Scanner sc = new Scanner(System.in);

        productService.addProduct(new Product(101, "Rice", 60, 50));
        productService.addProduct(new Product(102, "Sugar", 45, 30));

        HashMap<Integer, Integer> cart = new HashMap<>();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        cart.put(id, qty);
        double total = billingService.generateBill(cart, productService);

        System.out.println("Bill Generated. Total Amount: ₹" + total);
        sc.close();
    }
}

