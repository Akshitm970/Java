package personal;

public class moveHash {
    public static void main(String[] args) {
moveHash s = new moveHash();
String s1 = "Move#Hash#to#Front";
int m = s1.length();
s.moveHash(s1,m);
    }
    public  void moveHash(String str ,int n){
        String str1 = "";
        String str2 = "";
//        int count = 0;
        for(int i = 0;i<n;i++){
            if(str.charAt(i)=='#'){
                str1+=str.charAt(i);

            }
            else{
                str2 += str.charAt(i);
            }
    }
        System.out.println(str1+str2);
}
}
