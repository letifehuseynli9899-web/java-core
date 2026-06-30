package StaticAndInstanceTasks;

public class ProductTask {
    public static void main(String[] args) {

        Product product=new Product();

        System.out.println();
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product.inStock);
        System.out.println(product.quantity);
    }
}
