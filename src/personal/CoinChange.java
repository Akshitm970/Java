package personal;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,200,500};
        int val = 15;
        minCuirNotes(coins,val,0);
    }
    public static int minCuirNotes(int[] coins,int val , int count) {
        if(val == 0) return 0;
        for (int i = coins.length; i >0; i--){
            if(val>coins[i]){
                count += val/coins[i];
                val = val%coins[i];
            }
        }
        return count;
    }
}
