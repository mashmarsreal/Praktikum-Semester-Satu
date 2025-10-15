import java.util.Scanner;

public class IMTCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double b,t,IMT;
        String kondisi;
        System.out.printf("%-25s%s", "Berat badan (kg)", ": ");
        b = sc.nextDouble();
        System.out.printf("%-25s%s", "Tinggi badan (m)", ": ");
        t = sc.nextDouble();
        t = Math.pow(t,2);
        IMT = b/t;
        if (IMT <= 18.5) {
            kondisi = "kurus";
        } 
        else if (IMT <= 25 && IMT > 18.5) {
            kondisi = "normal";
        } 
        else if (IMT <= 30 && IMT > 25) {
            kondisi = "gemuk";
        } 
        else {
            kondisi = "kegemukan";
        }
        System.out.printf("%s%3.2f%s%s","IMT = ", IMT, " Termasuk ", kondisi);
    }

}
