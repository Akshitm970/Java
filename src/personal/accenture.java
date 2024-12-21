package personal;

import java.util.Scanner;

public class accenture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int max = arr[arr.length-1];

//        for(int i = 0;i<n;i++){
//            for(int j = i+1;j<n;j++){
//                if(arr[i]<=arr[j]){
//                    break;
//                }
//                if(j == arr.length){
//                    count++;
//                }
//            }
//        }

        for(int i = n-2;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
