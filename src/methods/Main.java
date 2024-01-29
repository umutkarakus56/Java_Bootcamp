package methods;

 public class Main{
	public static void main(String[] args) {
    
    sayiiBulmaca();
    
	}
    public static void sayiiBulmaca() {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int searching = 5;
        boolean ist = false;
        for(int number : numbers) {
        	if(number==searching) {
        		ist = true;
        		break;
        	}
        }
        String message="";
        if(ist) {
        	message = "Yes: " + searching;
        	messagesend(message);	
        }
        
        else {
        	System.out.println("No : "+ searching);
        }
    }
    public static void messagesend(String message) {
    	System.out.println(message);
    }
    }
