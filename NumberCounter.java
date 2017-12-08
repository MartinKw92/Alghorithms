import java.util.HashMap;
import java.util.Map;

public class NumberCounter {

    public int findMaxOccurences(int [] input) {
        if (input!=null) {
            Map<Integer, Integer> map = generateMapWithNumberCounters(input);
            if (map!=null) {
                return getMaxKey(map);
            }

        }
        return 0;
    }

    public Map<Integer, Integer> generateMapWithNumberCounters(int[] input) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int i=0;i<input.length;i++) {
            int value = input[i];
            // there was no value in map
            if (map.get(value)==null) {
                map.put(value,1);
            }
            // there was value in map
            else {
                int currentOcurrences = map.get(value);
                currentOcurrences +=1;
                map.put(value, currentOcurrences);
            }
        }
        return map;
    }

    private int getMaxKey(Map<Integer, Integer> map) {
                int maxValue = 0;
                int maxKey = -1;

                for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    int key = entry.getKey();
                    int value = entry.getValue();
                    System.out.println("Key "+key+ " Value "+value);
                    if (value > maxValue) {
                        maxValue = value;
                        maxKey = key;
                    }

        }
        return maxKey;
    }
}
