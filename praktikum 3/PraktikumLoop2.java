public class PraktikumLoop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 6  ; i++) {
            for (int j = 0; j < 11; j++) {
                if (j == 5-i)
                    System.out.print('A');
                else if (j == 5+i)
                    System.out.print('A');
                else if (i == 3 && j > 2 && j < 8)
                    System.out.print('A');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
