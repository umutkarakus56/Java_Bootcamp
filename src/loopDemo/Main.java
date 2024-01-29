package loopDemo;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngü bitti.");
        int i=1;
        while(i<12){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü bitti.");
        
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<12);
        System.err.println("Do-While döngüsü bitti.");

    }
}
