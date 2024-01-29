package mukemmelSayilar;

public class Main {
    public static void main(String[] args) {
        int number =27;
        int newnumber=0;
        if(number<1){
            System.out.println("invalid number");
            return;
        }
        if(number==1){
            System.out.println("It is not a perfect number.");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
            newnumber = newnumber+i;
            }
        }
            if (newnumber == number) {
                System.out.println("A perfect number");
            }
            else{
                System.out.println("It is not a perfect number");
            
            }
        


    }
}