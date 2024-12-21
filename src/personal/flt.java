package personal;
import java.text.DecimalFormat;
import java.util.*;
public class flt {
    public static void main (String[] args) {
        float littre = 20;
        float dist = 150;
        float out1 = (littre/dist)*100;
        System.out.printf("%.2f",out1);
        double miles = dist*0.6214;
        double gallons = littre*0.2642;
        double out2 = miles/gallons;
        System.out.printf("\n%.2f",out2);
    }
}