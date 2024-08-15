import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Product
{
    int prodID;
    String prodName;
    Double prodPrice;
    String category;
    public Product(int prodID, String prodName, Double prodPrice, String category) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product [prodID=" + prodID + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", category="
                + category + "]";
    }
    
}
public class LaunchStream 
{
    public static void main(String[] args) 
    {
        List<Product> list=Arrays.asList(
            new Product(1, "Laptop", 1200.00, "Electronics"),
            new Product(2, "Smartphone", 800.00, "Electronics"),
            new Product(3, "Tablet", 600.00, "Electronics"),
            new Product(4, "Headphones", 150.00, "Electronics"),
            new Product(5, "Refrigerator", 1500.00, "Home Appliance"),
            new Product(6, "Microwave", 200.00, "Home Appliance"),
            new Product(7, "T-shirt", 20.00, "Clothing"),
            new Product(8, "Jeans", 40.00, "Clothing"),
            new Product(9, "TV", 1000.00, "Electronics"),
            new Product(10, "Blender", 50.00, "Home Appliance")
        );
        List<Product>electronicProd=list.stream()
                                .filter(prod->prod.category.equalsIgnoreCase("Electronics"))
                                .collect(Collectors.toList());
        System.out.println("Electronics Products:");
        for(Product s:electronicProd){
            System.out.println(s);
        }
        List<Product>expensiveProd=list.stream()
                                .filter(prod->prod.prodPrice>1000)
                                .collect(Collectors.toList());
        System.out.println("Expensive Products worth more than 1000:");
        for(Product s:expensiveProd){
            System.out.println(s);
        }
        



        
    }
    
}
