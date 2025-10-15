import java.util.Scanner;

public class PraktikumLoop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil,w,x,y,z;
        do { 
            System.out.println("MENU");
            System.out.println("0. Keluar");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.println();
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pil = sc.nextInt();
            switch (pil) {
                case 0 -> {
                    break;
                }
                case 1 -> {
                    System.out.print("MASUKKAN NILAI R1: ");
                    x = sc.nextInt();
                    System.out.print("MASUKKAN NILAI R2: ");
                    y = sc.nextInt();
                    System.out.print("MASUKKAN NILAI R3: ");
                    z = sc.nextInt();
                    System.out.println();
                    System.out.println("VOLUME BALOK = " + (x*y*z));
                    break;
                }
                case 2 -> {
                    System.out.print("MASUKKAN NILAI r: ");
                    x = sc.nextInt();
                    System.out.println();
                    System.out.println("VOLUME BOLA = " + ((4*(3.14)*x*x*x)/3));
                    break;
                }
                case 3 -> {
                    System.out.print("MASUKKAN NILAI r: ");
                    x = sc.nextInt();
                    System.out.print("MASUKKAN NILAI t: ");
                    y = sc.nextInt();
                    System.out.println();
                    System.out.println("VOLUME KERUCUT = " + (((3.14)*x*x*y)/3));
                    break;
                }
                case 4 -> {
                    System.out.print("MASUKKAN NILAI r: ");
                    x = sc.nextInt();
                    System.out.print("MASUKKAN NILAI t: ");
                    y = sc.nextInt();
                    System.out.println();
                    System.out.println("VOLUME SILINDER = " + ((3.14)*x*x*y));
                    break;
                }
                case 5 -> {
                    System.out.print("MASUKKAN NILAI SISI 1 (alas): ");
                    x = sc.nextInt();
                    System.out.print("MASUKKAN NILAI SISI 2 (alas): ");
                    y = sc.nextInt();
                    System.out.print("MASUKKAN NILAI SISI 3 (alas): ");
                    z = sc.nextInt();
                    System.out.print("MASUKKAN NILAI TINGGI: ");
                    w = sc.nextInt();
                    System.out.println();
                    System.out.println("VOLUME LIMAS SEGITIGA: "+(Math.sqrt((((x+y+z)/2)*(((x+y+z)/2)-x)*(((x+y+z)/2)-y)*(((x+y+z)/2)-z))*w)/3));
                    break;
                }
                default -> System.out.println("INPUT INVALID");
            }
            System.out.println();
        } while (pil > 0 && pil < 6);
        System.out.println("Program dihentikan...");
    }
}
