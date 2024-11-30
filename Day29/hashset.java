package Day29;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        hs.add(10);
        hs.add(2);
        hs.add(5);
        hs.add(7);
        hs.add(20);
        hs.add(-10);

        ts.add(10);
        ts.add(2);
        ts.add(5);
        ts.add(7);
        ts.add(20);
        ts.add(-10);

        ls.add(10);
        ls.add(2);
        ls.add(5);
        ls.add(7);
        ls.add(20);
        ls.add(-10);
        ls.remove(20);
        // if (ls.contains(10))

        for (int i : hs) {
            System.out.print(i + " ");
        }

        System.out.println(hs);
        System.out.println(ts);
        System.out.println(ls);
    }
}