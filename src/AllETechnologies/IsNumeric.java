package AllETechnologies;

public class IsNumeric {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(isNumeric(s));
    }
    public static boolean isNumeric(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
