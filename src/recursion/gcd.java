package recursion;

public class gcd {
    public static void main(String[] args) {
        int m = 12;
        int n = 24;
        if (m<n){
            System.out.println(gcd1(m,n));
        }else {
            System.out.println(gcd1(n,m));
        }

    }
    public static int gcd1(int a, int b){
        for (int i=a;i>1;i--){
            if (a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }
}
