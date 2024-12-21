package leetCode;

public class shortestPalindrome214 {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aabb"));
    }
    public static String shortestPalindrome(String s) {
        String t = new StringBuilder(s).reverse().toString();
        for(int i = 0;i<t.length();i++){
            if(s.startsWith(t.substring(i))){
                return t.substring(0,i)+s;
            }
        }
        return t+s;
    }
}
