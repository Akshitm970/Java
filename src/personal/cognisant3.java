package personal;

//import javax.swing.*;
import java.util.*;
//import java.util.Scanner;

public class cognisant3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] num = {1,2,4};
        if(a<1 || a>12){
            System.out.println("Invalid Month Entered");
        }

        if(a<=5 && a>=3){
            System.out.println("Spring Season" );
        } else if (a<=8 && a>=6) {
            System.out.println("Summer Season");
        } else if (a<=11 && a>=9) {
            System.out.println("Autumn Season");
        } else  {
            System.out.println("Winter Season");
        }
        HashSet<Integer> hs = new HashSet<>();
//        num = hs.toArray(num);

    }
}
