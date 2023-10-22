import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alex");
        map.put(2, "Artem");
        map.put(6, "Andrew");
        map.put(3, "Vasya");
        map.put(9, "Roma");
        map.put(13, "Petya");
        map.put(8, "Tamir");
        map.put(7, "Marina");
        List<Integer> keys = List.of(1, 2, 5, 8, 9, 13);
        List<String> nameList = map.entrySet().stream()
                .filter(x-> keys.contains(x.getKey()))
                .filter(x -> x.getValue().length()%2!=0)
                .map(x-> new StringBuilder(x.getValue()).reverse().toString())
                .toList();
        System.out.println(nameList);
    }
}