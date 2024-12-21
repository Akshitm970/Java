package SlidingWindow;

public class MinZeroSwap {
    public static void main(String[] args) {
        int[] a= {0,0,1,0,0,0,1,0,1,1,0,0};
        System.out.println(SwapMinZero(a));
    }
    public static int SwapMinZero(int[] a){
        int one = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                one++;
            }
        }
            int min = 0;
        for (int i = 0; i < one; i++) {
            if (a[i] == 0) {
                min ++;
            }
        }
        int e = one;
        int s = 0;
        int minz = one;
        while(e<a.length){
            if(a[s]==0){min--;}
            if (a[e]==0){min++;}
            if (min<minz){
                minz = min;
            }
            s++;e++;
        }
        return minz;
    }
}
