package arraysDemo;

public class Main {
    public static void main(String[] args) {
        String ogrenci1="Umut";
        String ogrenci2="Ahmet";
        String ogrenci3="Mehmet";
        String ogrenci4="Ali";
        
        System.out.println(ogrenci4);
        System.err.println(ogrenci3);
        System.out.println(ogrenci2);
        System.out.println(ogrenci1);

        System.out.println("-------------------");

        String[] ogrenciler=new String[4];
        ogrenciler[0]="Umut";
        ogrenciler[1]="Ahmet";
        ogrenciler[2]="Mehmet";
        ogrenciler[3]="Ali";
        
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------");
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}

