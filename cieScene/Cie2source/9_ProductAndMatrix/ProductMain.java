package ProductAndMatrix9;
/*9 a. Consider a scenario of verifying the product and displaying its content on the screen whether the product is valid or not. 
Implement a program for this by handling the exception such as “InvalidProductException” if the weight of the product is more than 100kg and the manufacturer is not “BMS”.*/
class Product {
    private String manufacturer; 
    private double weight; 
    private String content;
    Product(String manufacturer, double weight, String content) { 
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.content = content;
    }
    public String getManufacturer() { 
        return manufacturer;
    }
    public double getWeight() { 
        return weight;
    }
    public String getContent() { 
        return content;
    } 
}
class InvalidProductException extends Exception { 
    InvalidProductException(String message) {
        super(message); 
    }
}
class ProductVerifier {
    public static void verifyProduct(Product product) throws InvalidProductException {
        if (product.getWeight() > 100 && !product.getManufacturer().equals("BMS")) {
            throw new InvalidProductException("Invalid product: weight greater than 100kg and not manufactured by BMS"); 
        }
    } 
}
public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("BMS", 90, "Electronics"); try {
        ProductVerifier.verifyProduct(product);
        System.out.println("Product is valid. Content: " + product.getContent()); } 
        catch (InvalidProductException e) {
            System.out.println(e.getMessage()); 
        }
    } 
}
