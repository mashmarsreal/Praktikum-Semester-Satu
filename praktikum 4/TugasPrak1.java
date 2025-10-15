import java.util.Scanner;
public class TugasPrak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil,cursor=0,data1;
        double mmm=0;
        int Data[] = new int[99999];
        //loop
        do { 
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            pil = sc.nextInt();
            switch (pil) {
                case 1 -> {
                    System.out.print("Masukkan jumlah nilai yang akan ditambah: ");
                    data1 = sc.nextInt();
                    System.out.println("Masukkan datanya (pisah dengan spasi atau enter):");
                    for (int i = 0; i < data1; i++) {
                        Data[cursor] = sc.nextInt();
                        cursor++;
                    }
                    System.out.println();
                    break;
                }
                case 2 -> {
                    System.out.println("Data:");
                    for (int i = 0; i < cursor; i++) {
                        System.out.print(Data[i] + " ");
                    }
                    System.out.println();
                    System.out.println();
                    break;
                }
                case 3 -> {
                    mmm = 0;
                    System.out.print("Rata-rata: ");
                    for (int i = 0; i < cursor; i++) {
                        mmm += Data[i];
                    }
                    mmm /= (cursor);
                    System.out.printf("%.2f\n",mmm);
                    System.out.println();
                    break;
                }
                case 4 -> {
                    mmm = 0;
                    System.out.print("Sum: ");
                    for (int i = 0; i <= cursor; i++) {
                        mmm += Data[i];
                    }
                    System.out.printf("%.0f\n",mmm);
                    System.out.println();
                    break;
                }
                case 5 -> {
                    System.out.print("Max: ");
                    mmm = Data[0];
                    for (int i = 0; i < cursor; i++) {
                        if (mmm <= Data[i]){
                            mmm = Data[i];
                        }
                    }
                    System.out.printf("%.0f\n",mmm);
                    System.out.println();
                    break;
                }
                case 6 -> {
                    System.out.print("Min: ");
                    mmm = Data[0];
                    for (int i = 0; i < cursor; i++) {
                        if (mmm >= Data[i]){
                            mmm = Data[i];
                        }
                    }
                    System.out.printf("%.0f\n",mmm);
                    System.out.println();
                    break;
                }
            }
            
        } while (pil != 7);
    }
}