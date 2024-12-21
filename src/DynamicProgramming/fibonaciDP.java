package DynamicProgramming;

public class fibonaciDP {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n+1];
        System.out.println(fibonaci(n, a));
    }
    public static int fibonaci(int n, int[] arr) {
        if(n ==0 || n == 1){
            return n;
        }
        if(arr[n] != 0){
            return arr[n];
        }
        int m = fibonaci(n-1,arr);
        int l = fibonaci(n-2,arr);

        arr[n] = m+l;
        return m+l;
    }
}
