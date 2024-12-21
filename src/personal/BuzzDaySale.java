package personal;
import java.util.Scanner;
import java.util.ArrayList;
public class BuzzDaySale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> l = new ArrayList<>(n);
        ArrayList<Integer> c = new ArrayList<>(n);

        for (int i = 0; i < n; i++) l.add(scanner.nextInt());
        for (int i = 0; i < n; i++) c.add(scanner.nextInt());

        int budget = scanner.nextInt();
        int m = 0, f = 0;

        for (int i = 0; i < n; i++) {
            int buyCost = c.get(i);
            int quantity = budget / buyCost;

            if (quantity > 0) {
                int cf = 0;
                int w = 0;

                for (int j = 0; j < n; j++) {
                    if (i != j && l.get(i) % l.get(j) == 0) {
                        cf += quantity;
                        w += c.get(j) * quantity;
                    }
                }

                if (cf > m || (cf == m && w > f)) {
                    m = cf;
                    f = w;
                }
            }
        }

        System.out.println(m + " " + f);
        scanner.close();
    }
}

