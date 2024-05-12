package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
        Map m = new java.util.TreeMap();
        m.put("java" ,80);
        m.put("JS" ,56);
        m.put("HTML" ,65);
        m.put("c" ,90);

        Set s = m.keySet();
        Iterator i = s.iterator();
        while (i.hasNext()){
            Object k = i.next();
            Object v =m.get(k);
            System.out.println(k +"=" + v);
        }
    }
}
