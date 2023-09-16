package staticExample;

public class Main {
	public static void main(String[] args) {
		Product product = new Product();
		ProductManager productManager = new ProductManager();
		
		product.price = 1100;
		product.name = "Macbook Pro";
		
		productManager.add(product);
	}
}
