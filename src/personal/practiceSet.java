package personal;

import javax.swing.text.DateFormatter;
import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class practiceSet {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        ar.add("F");
        for(Object o : ar){
            System.out.println(o);
        }

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);
        s.add(10);
        s.add(6);
        System.out.println(s);

        Calendar ca = Calendar.getInstance();
        System.out.println(ca.get(Calendar.HOUR_OF_DAY) +":"+ ca.get(Calendar.MINUTE) +":"+ ca.get(Calendar.SECOND));

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);

    }
}
