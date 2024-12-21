package SlidingWindow;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] a = {1,5,4,2,9,9,9};
        int key = 3;
        System.out.println(maxSubArr(a,key));
    }
    public static int maxSubArr(int[] a,int k){
        int max=0;
        for(int i=0;i<k;i++){
            max += a[i];
        }
        int finalmax = max;
        int n = a.length;
        int e = k;
        int s = 0;
        while (e<n){
            max = max-a[s]+a[e];
            if(max>finalmax){
                finalmax = max;
            }
            s++;
            e++;
        }
        return finalmax;
    }
}
