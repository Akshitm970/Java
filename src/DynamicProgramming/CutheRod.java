package DynamicProgramming;

public class CutheRod {
    public static void main(String[] args) {
        int[] profit = {1, 5, 8, 9, 10, 17, 17, 20};
        int l = profit.length;
        System.out.println(cutRod(profit,l));
    }
    public static int cutRod(int[] profit,int l) {
        if(l == 0) return 0;
        if(l == 1) return profit[0];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<profit.length;i++) {
            int maxc = profit[l-i]+profit[i];
            if(maxc > max) {
                max = maxc;
            }
        }
        return max;
    }
}
