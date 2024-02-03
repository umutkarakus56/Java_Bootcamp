package abstractDemo;

public class Main {
public static void main(String[] args) {
	CustomerManager customerManager = new CustomerManager();
	MySqlDatabaseManager database = new MySqlDatabaseManager();
	database.getData();
}
}
