package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        String s = "banana";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!m.containsKey(c)){
                m.put(c,1);
            }
            else {
                int n = (Integer)m.get(c);
                n++;
                m.put(c,n);
            }
        }
        Iterator itr = m.keySet().iterator();
        while (itr.hasNext()){
            Object k = itr.next();
            Object v = m.get(k);
            System.out.println(k + "=" + v);
        }
    }
}
