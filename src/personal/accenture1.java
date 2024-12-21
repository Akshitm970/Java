package personal;

import java.util.Scanner;

public class accenture1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
//        input = input*2;
        int ans = 1;
        for(int i = 1;i<=input;i++){
            ans = (ans +i)%1000000007 ;
        }

//        int mobu = input%1000000007;
        System.out.println(ans);
    }
//    public static int sol(int n){
//        if(n == 1){
//            return 2;
//        }
//
//    }
}
