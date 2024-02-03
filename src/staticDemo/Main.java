package staticDemo;

public class Main {

	public static void main(String[] args) {
			ProductManager manager = new ProductManager();
			Product product = new Product();
			product.price = 9;
			product.name = "mouse";
			product.id = 5;
			manager.add(product);
			
			DatabaseHelper.Connection.CreateConnection();
			
	}

}
