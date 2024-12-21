package personal;

public class DecToOct {
    public static void main(String[] args) {
        int a = 33;
        dectooct(a);
    }
    public static void dectooct(int a){
        int[] m = new int[32];
        int i = 0;
        while (a>0){
            m[i] = a%8;
            a = a/8;
            i++;
        }
        for (int j = i-1;j>=0;j--){
            System.out.print(m[j]);
        }
    }
}
