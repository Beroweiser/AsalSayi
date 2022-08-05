
public class AsalSayi {
    public static void main(String[] args) {

        for (int a = 1; a < 100; a++) {
            int sayac = 0;
            for (int i = 1; i <= a; i++) {

                if (a % i == 0) {
                    sayac++;

                }

            }
            if (sayac == 2) {
                System.out.print(a + " ");
            }

        }
    }
}
