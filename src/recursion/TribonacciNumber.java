package recursion;
import java.util.HashMap;
import java.util.Map;
public class TribonacciNumber {
    public static void main(String[] args) {
        TribonacciNumber n = new TribonacciNumber();
        System.out.println(n.tribonacci(5));
    }
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        } if(n==1 || n == 2){
            return 1;
        }
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,0);
        m.put(1,1);
        m.put(2,1);
        return trib(n-1,m)+trib(n-2,m)+trib(n-3,m);
    }
    private int trib(int n,Map<Integer,Integer> m){
        if(m.containsKey(n)){
            return m.get(n);
        }
        m.put(n,trib(n-1,m)+trib(n-2,m)+trib(n-3,m));
        return trib(n-1,m)+trib(n-2,m)+trib(n-3,m);
    }
}