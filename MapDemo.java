import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "96");
        map.put(9, "95");
        map.put(1, "97");
        map.put(2, "98");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        if (map.containsKey(1)) {
            String value = map.get(1);
            System.out.println("value for key 1 is: " + value);
        } else {
            System.out.println("key is not found");
        }

        map.put(10, "89");
        map.remove(10);
    }
}
