import java.util.Scanner;

class Product {
   
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    
    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = (price < 0) ? 0.0 : price;
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }

    
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = (price < 0) ? 0.0 : price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }

    // Apply discount
    public void applyDiscount(double percentage) {
        if (percentage >= 0) {
            price = price - (price * percentage / 100);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String productId = sc.nextLine();
        String productName = sc.nextLine();
        double price = sc.nextDouble();
        int stockQuantity = sc.nextInt();
        double discount = sc.nextDouble();

       
        Product p = new Product(productId, productName, price, stockQuantity);

        
        p.applyDiscount(discount);

        
        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());

        sc.close();
    }
}