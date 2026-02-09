package BMS;

import java.io.FileWriter;
import java.util.Map;

public class BillingService {

    public double generateBill(Map<Integer, Integer> cart, ProductService service) throws Exception {
        double total = 0;
        FileWriter writer = new FileWriter("bill.txt", true);

        for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {

            Product p = service.getProduct(entry.getKey());

            // ✅ FIX: null check
            if (p == null) {
                throw new Exception("Product ID " + entry.getKey() + " not found");
            }

            int qty = entry.getValue();

            if (p.getQuantity() < qty) {
                throw new Exception("Insufficient stock for " + p.getName());
            }

            p.setQuantity(p.getQuantity() - qty);
            double cost = p.getPrice() * qty;
            total += cost;

            writer.write(p.getName() + " x " + qty + " = ₹" + cost + "\n");
        }

        writer.write("Total: ₹" + total + "\n\n");
        writer.close();

        return total;
    }
}


