package MapsAndSets;
import java.util.HashMap;
public class MapsSTL {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghay",25); map.put("Abhinav Sir",35);// add
        map.put("Vivek",17); map.put("Deepika",19);
        for(String key : map.keySet()) System.out.print(key + " " +map.get(key) + " ");
//        System.out.println(map+" "+map.size());
//        System.out.println(map.containsKey("Vivek"));
//        System.out.println(map.remove("Vivek"));
//        System.out.println(map+" "+map.size());
//        System.out.println(map.get("Raghay"));
//        map.put("Deepika",20);
//        System.out.println(map+" "+map.size());
//        System.out.println(map.containsKey("Vivek"));
    }
}
