import java.util.Scanner;

public class GajiCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jam,upah,lembur = 0 ,denda = 0,total;
        System.out.printf("%-15s%s", "Jam kerja", ":");
        jam = sc.nextInt();
        if (jam <= 60){
            upah = 5000 * jam;
            if (jam < 50){
                denda = (50-jam)*1000;
            }
        }
        else {
            upah = 5000 * 60;
            lembur = (jam-60)*6000;
        }
        total = upah + lembur - denda;
        System.out.printf("%-15s%s%d\n", "Upah","= Rp. ", upah);
        System.out.printf("%-15s%s%d\n", "Lembur","= Rp. ", lembur);
        System.out.printf("%-15s%s%d\n", "Denda","= Rp. ", denda);
        System.out.println("---------------------");
        System.out.printf("%-15s%s%d\n", "Total","= Rp. ", total);
    }

}
