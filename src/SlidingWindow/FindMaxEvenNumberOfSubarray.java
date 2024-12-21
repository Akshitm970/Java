package SlidingWindow;

public class FindMaxEvenNumberOfSubarray {
    public static void main(String[] args) {
        int [] a = {1,2,4,5,5,6,67,8,9,5,43,54,2,5,6,8,4,2};
        int k = 9;
        System.out.println(findMaxNumberEvenSubarray(a,k));
    }
    public static int findMaxNumberEvenSubarray(int[] arr,int k) {
        int evenNumber = 0;
        for (int i = 0;i<k;i++){
            if(arr[i]%2==0){
                evenNumber++;
            }
        }
        int max = evenNumber;
        int e = k;
        int s = 0;
        while (e<arr.length){
            if(arr[s]%2==0){
                evenNumber--;
            }
            if (arr[e]%2==0){
                evenNumber++;
            }
        s++;
            e++;
        }
        max = evenNumber;
        return max;
    }

}
