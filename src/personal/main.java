package personal;

public class main {
    public static void main(String[] args) {
        int n = 10;
        printNumber(n);
        System.out.println(count(n));
    }
    public static void printNumber(int n) {
        if(n<=0){
            return;
        }
//            System.out.println(printNumber(n-1));
            printNumber(n-1);
            System.out.println(n);

    }
    public static int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
}
