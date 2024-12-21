package wipro;
import java.util.Scanner;
public class MinCostApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 19;
//        int m1 = sc.nextInt();
        int m1 = 3;
//        int p1 = sc.nextInt();
        int p1 = 10;
//        int m2 = sc.nextInt();
        int m2 = 4;
//        int p2 = sc.nextInt();
        int p2 = 15;
        int min = Integer.MAX_VALUE;
        for (int i = 0; m1 * i <= n; i++) {
            int rem = n - i * m1;
            if (rem % m2 == 0) {
                int cost = p1 * i + p2 * (rem / m2);
                min = (cost < min || min == -1) ? cost : min;
            }
        }
        if (min != -1)
            System.out.println(min);
    }
}
//}}