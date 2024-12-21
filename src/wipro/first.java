package wipro;

public class first {
    public static void main(String[] args) {
        int[] ar = {1,2,1,2,1,3,2};
        int[] arr = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            arr[ar[i]]++;
        }
        int ans = 0;
        for (int i = 0; i < ar.length; i++) {
            ans = ans+arr[i]/2;
        }
        System.out.println( ans);
    }
}
