package strings;

public class sumOfnumberOfString {
    public static void main(String[] args) {
        String str = "12abc20yz68";
//        System.out.println(findSum(str));
        String temp = "0";
        int sum = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                temp = temp + ch;
            }else{
                sum = sum+Integer.parseInt(temp);
                temp="0";
            }

        }
        System.out.println(sum);
    }
}
