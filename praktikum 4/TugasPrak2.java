import java.util.Scanner;
public class TugasPrak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Data = {
            {50000, 2, 0, 0}, 
            {100000, 5, 1, 0},
            {200000, 7, 1, 0},
            {300000, 10, 1, 1}
        };
        int[] Tiket = new int[4];
        String[] Nama = {"Ekonomi", "Bisnis", "Eksekutif", "Pariwisata"};
        int pil,pil1,total=0;
        String cac, ccol;
        do { 
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Nilai: ");
            pil = sc.nextInt();
            switch (pil) {
                case 1 -> {
                    System.out.printf("%-12s|%-13s|%-8s|%-12s|%-12s\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    for (int i = 0; i < 4; i++) {
                        if (Data[i][2] == 0) {
                            cac = "Tidak Ada";
                        } else {
                            cac = "Ada";
                        }
                        if (Data[i][3] == 0) {
                            ccol = "Tidak Ada";
                        } else {
                            ccol = "Ada";
                        }
                        System.out.printf("%-12s|Rp %-10s|%-7d%%|%-12s|%-12s\n",
                        Nama[i], String.format("%,d", Data[i][0]), Data[i][1], cac, ccol);
                    }
                }
                case 2 -> {
                    System.out.printf("%-12s|%-13s|%-8s\n", "Jenis", "Harga", "Diskon");
                    for (int i = 0; i < 4; i++) {
                        if (Data[i][2] == 1){
                            System.out.printf("%-12s|Rp %-10s|%-7d%%\n", Nama[i], String.format("%,d", Data[i][0]), Data[i][1]);
                        }
                    }
                }
                case 3 -> {
                    System.out.printf("%-12s|%-13s|%-8s\n", "Jenis", "Harga", "Diskon");
                    for (int i = 0; i < 4; i++) {
                        if (Data[i][3] == 1){
                            System.out.printf("%-12s|Rp %-10s|%-7d%%\n", Nama[i], String.format("%,d", Data[i][0]), Data[i][1]);
                        }
                    }
                }
                case 4 -> {
                    do {
                         
                        System.out.println("PILIH KERETA:");
                        System.out.println("1. Ekonomi");
                        System.out.println("2. Bisnis");
                        System.out.println("3. Eksekutif");
                        System.out.println("4. Pariwisata");
                        System.out.println("0. Keluar");
                        System.out.print("Masukkan Tiket yang ingin dibeli: ");
                        pil1 = sc.nextInt();
                        switch (pil1) {
                            case 1 -> {
                                System.out.print("Masukkan banyak tiket yang akan dibeli: ");
                                Tiket[0] += sc.nextInt();
                            }
                            case 2 -> {
                                System.out.print("Masukkan banyak tiket yang akan dibeli: ");
                                Tiket[1] += sc.nextInt();
                            }
                            case 3 -> {
                                System.out.print("Masukkan banyak tiket yang akan dibeli: ");
                                Tiket[2] += sc.nextInt();
                            }
                            case 4 -> {
                                System.out.print("Masukkan banyak tiket yang akan dibeli: ");
                                Tiket[3] += sc.nextInt();
                            }
                        }
                    } while (pil1 != 0);
                }
                case 5 -> {
                    for (int i = 0; i < 4; i++) {
                        if (Tiket[i]>0){
                            int hargaSetelahDiskon = Data[i][0] * (100 - Data[i][1]) / 100;
                            int subtotal = hargaSetelahDiskon * Tiket[i];
                            System.out.printf("%-12sx%3d|Rp %-10s\n", Nama[i], Tiket[i], String.format("%,d", subtotal));
                            total += subtotal;
                        }
                    }
                    System.out.println("TOTAL = Rp " + String.format("%,d", total));
                }
            }
        } while (pil != 0);
        sc.close();
    }
}