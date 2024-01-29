package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",5000,2,"Black");
		//Product product = new Product();
		product.setName("Laptop");
		product.setPrice(5000);
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);
		
       ProductManager productManager = new ProductManager();
       productManager.Add(product);
       
       System.out.println(product.getKod());
       }

}