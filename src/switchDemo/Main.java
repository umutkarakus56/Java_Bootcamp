package switchDemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'U';
        switch (grade) {
            case 'A':
                System.out.println("Geçtiniz.");
                break;
            case 'B':
                System.out.println("Geçtiniz.");
                break;
            case 'C':
                System.out.println("Geçtiniz.");
                break;
            case 'D':
                System.out.println("Geçtiniz.");
                break;
            case 'F':
                System.out.println("Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}

