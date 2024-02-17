package collection;

import java.util.HashMap;
import java.util.Map;

/*
map is a interface provided by collection framework
 */
public class MapInterfaceExample {
    public static void main(String[] args) {
        // adding key value pair to the map
        Map<String, Integer> map = new HashMap<>();
        map.put("guna", 25);
        map.put("ssg", 24);
        System.out.println(map);

        // get("key") method takes key and returns the value
        System.out.println(map.get("guna"));

        // keys should be unique
        // Map is combination of set and list

        // accessing all the keys
        System.out.println(map.keySet());
    }
}
