import java.util.Scanner;

public class PerhitunganKWH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posAwal,posAkhir,beban,PPJ,pemakaian,pajak,tanpaPajak;
        String nama,kel;
        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.printf("%-20s%s","Masukkan Nama",": ");
        nama = sc.nextLine();
        System.out.printf("%-20s%s","Kelurahan",": ");
        kel = sc.nextLine();
        System.out.printf("%-35s%s","Masukkan posisi awal Kwh Meter",": ");
        posAwal = sc.nextInt();
        System.out.printf("%-35s%s","Masukkan posisi akhir Kwh Meter",": ");
        posAkhir = sc.nextInt();
        System.out.printf("%-35s%s","Masukkan biaya beban saat ini",": ");
        beban = sc.nextInt();
        System.out.printf("%-35s%s","Masukkan PPJ (dalam persen)",": ");
        PPJ = sc.nextInt();

        pemakaian = posAkhir - posAwal;
        tanpaPajak = beban * pemakaian;
        pajak = (PPJ * tanpaPajak)/100;

        System.out.println("====================PLN Java====================");
        System.out.printf("%-20s%s%s\n", "Nama",": ",nama);
        System.out.printf("%-20s%s%s\n", "Kelurahan", ": ", kel);
        System.out.printf("%-20s%s%d%s\n", "Pemakaian bulan ini", ": ", pemakaian, " Kwh Meter");
        System.out.printf("%-20s%s%d%s\n", "Tarif listrik", ": Rp ", tanpaPajak, ",-");
        System.out.printf("%-20s%s%d%s\n", "PPJ " + PPJ + "%", ": Rp ", pajak, ",-");
        System.out.printf("%-20s%s%d%s\n", "Total bayar", ": Rp ", tanpaPajak + pajak, ",-");
        System.out.println("================================================");
    }

}
