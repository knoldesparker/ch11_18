import java.util.HashMap;
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
    }
    public static void reverse(Map<String,String> map){
        Map<String,Set<String>> value = new HashMap<>();
    }
}
