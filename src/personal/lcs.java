package personal;

public class lcs {
    public static void main(String[] args) {
        String s = "ABCDGH";
        String s2 ="AEDFHR";
        int m = s.length();
        int n = s.length();
        System.out.println(longest(s,s2,m,n));
    }
    public static int longest(String s,String s2,int m,int n){
        if (m==0|| n == 0){
            return 0;
        }
        if(s.charAt(m-1) == s.charAt(n-1)){
            return 1+longest(s,s2,m-1,n-1);
        }else {
            return Math.max(longest(s,s2,m-1,n),longest(s,s2,m,n-1));
        }
    }
}
