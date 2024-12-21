package personal;

public class asscenture {
    public static void main(String[] args) {
        int m = 6;
        int n = 30;
        int sum1 = 0;
//        int i = 0;
        int sum2 = 0;
        for(int i = 1;i<=n;i++){
            if(i%m == 0){
                sum1 += i;
            }else {
                sum2 += i;
            }
        }
//        System.out.println(sum2-sum1);
//        int[] k = {7,9,5,2,8,7};
        int[] k = {2 ,8 ,9 ,7 ,4, 2};
//        System.out.println(biggernumber(6,k));
        System.out.println(FindNumberOfSuperiorElements(k,k.length));
    }
    public static int biggernumber(int m,int n[]){
        int count = 0;
        for(int i = 0;i<m;i++){
            for(int j = i+1;j<m;j++){
                if(n[i]<=n[j]){
                    break;
                }
                if(n[i]==n[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int FindNumberOfSuperiorElements(int[] arr, int n) {
        int count = 0;
        int maxFromRight = Integer.MIN_VALUE;

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If the current element is greater than the max from the right, it's superior
            if (arr[i] > maxFromRight) {
                count++;
                maxFromRight = arr[i];
            }
        }
        return count;
    }
}
