package personal;

public class thirdConsonant {
    public static void main(String[] args) {
        String s = "jilhgyvi";
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == 'a'||'e'==s.charAt(i) || 'i'==s.charAt(i) || 'o' == s.charAt(i) || 'u' == s.charAt(i)){
                continue;
            }else{
                count++;
                if(count==3){
                    System.out.println(s.charAt(i));
                }
            }
        }
    }
}
