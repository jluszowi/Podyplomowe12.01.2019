import java.util.Random;

public class Lab42poprawione {
    public static void main(String[] args) {

        int i = 0;
        int k = 0;
        int g = 0;
        int x = 0;


        do {x++;
            Random random = new Random();
            i = random.nextInt(10);
            System.out.println(i);

            k = random.nextInt(10);
            System.out.println(k);

            g = random.nextInt(10);
            System.out.println(g);

        } while (i != 7 || k != 7 || g != 7);

        System.out.println("Ilość prób: " + x);
        if (i == 7 && k == 7 && g == 7) {
            System.out.println("Wygrana");

        }

    }
}