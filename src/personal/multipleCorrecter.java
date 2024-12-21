package personal;

import java.util.HashMap;

public class multipleCorrecter {
    public static void main(String[] args) {
        String s = "abbbbeeeeffggg";
        System.out.println(str(s));
    }
    public static String str(String str) {
        HashMap<Character,Integer> ds = new HashMap<>();
        for(char c : str.toCharArray()) {
            ds.put(c, ds.getOrDefault(c,0) + 1);
        }
        String res = "";
        for(char c : ds.keySet()) {
            if(ds.get(c) == 1) {
                res += c;
            }else
                res += c+""+ds.get(c);
        }
        return res;
    }
}
