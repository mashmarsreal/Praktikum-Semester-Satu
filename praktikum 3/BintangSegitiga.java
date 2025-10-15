import java.util.Scanner;

public class BintangSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n-i-2; j++){
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

