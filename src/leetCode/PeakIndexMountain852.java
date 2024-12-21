package leetCode;

public class PeakIndexMountain852 {
    public static void main(String[] args) {
        int[] a = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(a));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > max) {
                max = i;
            }
        }

        return max;
    }
}
