package recursion;

public class fibo {
    public static int fibonaci(int n) {
        if (n==0 || n==1){
            return n;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonaci(6));
    }
}
