import java.util.Scanner;

public class LuasDanKeliling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,r,pilihan;
        double keliling,luas;
        System.out.printf("%s\n%s\n%s\n%s\n\n%s", "Menu:","1. menghitung luas dan keliling persegi panjang", "2. menghitung luas dan keliling lingkaran", "3. menghitung luas dan keliling segitiga", "Pilihan anda: ");
        pilihan = sc.nextInt();
        switch (pilihan) {
            case 1 -> {
                System.out.printf("Masukkan a: ");
                a = sc.nextInt();
                System.out.printf("Masukkan b: ");
                b = sc.nextInt();
                if (a >= 0 && b >= 0){
                    System.out.println("");
                    System.out.printf("%-25s%s%d%s\n","Keliling persegi panjang", ": ", (a+b)*2, " cm");
                    System.out.printf("%-25s%s%d%s\n","luas persegi panjang", ": ", a*b, " cm2");
                }
                else System.out.println("Tidak mungkin negatif!");
            }
            case 2 -> {
                System.out.printf("Masukkan r: ");
                r = sc.nextInt();
                if (r >= 0){
                    if (r % 7 == 0){
                        System.out.println("");
                        System.out.printf("%-25s%s%d%s\n","Keliling lingkaran", ": ", (r+r)*22/7, " cm");
                        System.out.printf("%-25s%s%d%s\n","luas lingkaran", ": ", 22*r*r/7, " cm2");
                    }
                    else {
                        System.out.println("");
                        System.out.printf("%-25s%s%.3f%s\n","Keliling lingkaran", ": ", r*2*3.14, " cm");
                        System.out.printf("%-25s%s%.3f%s\n","luas lingkaran", ": ", 3.14*r*r, " cm2");
                    }
                }
                else System.out.println("Tidak mungkin negatif!");
                
            }
            case 3 -> {
                System.out.printf("Masukkan a: ");
                a = sc.nextInt();
                System.out.printf("Masukkan b: ");
                b = sc.nextInt();
                System.out.printf("Masukkan r: ");
                r = sc.nextInt();
                keliling = a+b+r;
                double s = keliling/2;
                luas = Math.sqrt((s*(s-a)*(s-b)*(s-r)));
                if (a >= 0){
                    System.out.println("");
                    System.out.printf("%-20s%s%.0f%s\n","Keliling segitiga", ": ", keliling, " cm");
                    System.out.printf("%-20s%s%.0f%s\n","luas segitiga", ": ", luas, " cm2");
                }
                else System.out.println("Tidak mungkin negatif!");
            }
            default -> System.out.println("Data tak ditemukan, program dihentikan ...");
        }
    }

}
