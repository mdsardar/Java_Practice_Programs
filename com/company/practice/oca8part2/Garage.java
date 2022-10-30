package practice.com.company.practice.oca8part2;

import java.util.HashMap;

public class Garage {
    public static void main(String[] args) {
        var hm = new HashMap<String, String>();
        String[] k = {null, "2", "3", "2", "5"};
        String[] v = {"a", "b", "c", "d", "e"};

        for (int i = 0; i < 5; i++) {
            hm.put(k[i], v[i]);
        }
        System.out.println(hm.size() + " " + hm.keySet() + " " + hm.values() + "\n");
    }
}
