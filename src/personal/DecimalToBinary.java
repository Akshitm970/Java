package personal;

public class DecimalToBinary {
    public static void main(String[] args) {
        int m = 3;
        decToBin(m);
    }
    public static void decToBin(int n){
        int[] a = new int[32];
        int i = 0;
        while (n>0){
            a[i]=n%2;
            n = n/2;
            i++;
        }
        for (int j = i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}
