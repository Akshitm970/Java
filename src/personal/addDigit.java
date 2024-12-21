package personal;

public class addDigit {
    public static void main(String[] args) {

    }
    public int addDigits(int num) {
        int l = 0;
        String a = Integer.toString(num);
//        char[] ar = a.toCharArray();
        l = a.length();
        return l;
    }
    public int maximum69Number (int num) {
        int max = num;
        char[] arr = Integer.toString(num).toCharArray();
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] == '9') {
                arr[i] = '6';
            }
            if (arr[i] == '6') {
                arr[i] = '9';
            }
            String s = new String(arr);
            int m = Integer.parseInt(s);
            if (m>max){
                max = m;
            }
        }
        return max;
    }
}
