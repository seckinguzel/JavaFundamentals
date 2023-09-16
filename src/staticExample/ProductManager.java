package staticExample;

public class ProductManager {
	public void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println("Product is added!");
		} else {
			System.out.println("Product hasn't been added because product informations are not valid!");
		}
	}
}
