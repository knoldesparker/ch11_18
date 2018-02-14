import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("3", "Marty");
        map.put("42", "Marty");
        map.put("31","Dave");
        map.put("82", "Sue");
        map.put("17", "Ed");
        map.put("29", "Ed");
        map.put("56", "Ed");

        System.out.println(reverse(map));
    }
    public static Map<String, Set<String>> reverse(Map<String,String> map){
        Map<String,Set<String>> value = new HashMap<>();

        for (Map.Entry<String,String> m: map.entrySet()){
            if (value.containsKey(m.getValue())){
                Set<String> set = value.get(m.getValue());
                set.add(m.getKey());
                value.put(m.getValue(), set);
            } else {
                Set<String> set = new HashSet<>();
                set.add(m.getKey());
                value.put(m.getValue(), set);
            }
        }
        return value;
    }

}
