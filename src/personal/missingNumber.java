package personal;

//import java.util.Arrays;
import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumber(arr));
    }
    public static int findNumber(int[] nunm){
//        Arrays.sort(nunm);
//        int i = nunm[0];
//        int j= nunm[nunm.length-1];
//        while(i <= j){
//            if(nunm[i] +1 != nunm[i+1]){
//                return nunm[i]+1;
//            }
//        }
//    return 0;
        int n = nunm.length-1;
        int a = (n*(n+1))/2;
        int b = Arrays.stream(nunm).sum();
        return b-a;
    }
}
