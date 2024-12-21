package strings;

public class first {
    public static void main(String[] args) {
        int a,b;
        a = 3;
        b = 6;
        int[] c = {3,4,16};
        System.out.println(totalcount(a,b,c));
    }
    public static int totalcount(int a,int b,int c[]){
        int count = 0;
        int i = 0,j= a-1;
        while(i<=j){
            if(c[i]+c[j] <= b){
                count++;
                i++;
            }
            else {
                j--;
            }
        }
        return count++;
    }
}
