package strings;

public class reverse {
    public static void main(String[] args) {
        String a = "Geeks";
        String b = "";
        for(int i = 0;i<a.length();i++){
            b = b+a.charAt(a.length()-i-1);
        }
        System.out.println(b);
    }
}
