import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.printf("%-30s%s","Masukkan operator pertama", ": ");
        a = sc.nextInt();
        System.out.printf("%-30s%s","Masukkan operator kedua", ": ");
        b = sc.nextInt();
        System.out.printf("%-25s%s%-15.0f\n","  Hasil penjumlahan", ":", a + b);
        System.out.printf("%-25s%s%-15.0f\n","  Hasil pengurangan", ":", a - b);
        System.out.printf("%-25s%s%-15.0f\n","  Hasil perkalian", ":", a * b);
        System.out.printf("%-25s%s%-15.1f\n","  Hasil pembagian", ":", a / b);
    }
}
