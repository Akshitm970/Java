package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Maibn {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("Akm",21);
        mp.put("MM",1);
        mp.put("km",2);
        mp.put("Am",210);
        mp.put("Ak",10);
        System.out.println(mp.get("Akm"));
        mp.remove("Akm");
        System.out.println(mp.get("Akm"));
        System.out.println(mp.containsKey("Akm"));
        mp.putIfAbsent("Akm",10);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        System.out.println(mp);
    }
}
