package personal;

import java.util.Scanner;

public class accenture5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();
        int count = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                for(int j= i;j<A.length;j++){
                    if(A[j]==0){
                        A[j] = 1;
                    }
                    else {
                        A[j] = 0;
                    }
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
