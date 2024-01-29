package sayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int searching = 3;
        boolean ist = false;
        for(int number : numbers) {
        	if(number==searching) {
        		ist = true;
        		break;
        	}
        }
        
        if(ist) {
        	System.out.println("Yes");
        }
        
        else {
        	System.out.println("No");
        }
    }
}
