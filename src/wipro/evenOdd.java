package wipro;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int[] arrn = new int[n];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                arrn[count] = arr[i];
                count++;
            }

        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arrn[count] = arr[i];
                count++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arrn[i]+" ");
        }
    }
}
