
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static java.lang.Math.abs;

public class B {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) map.put(i, 0);

        for (int i = 0; i < 10; i++) {
            int rdInt = rd.nextInt(10);
            int n = map.get(rdInt);
            map.put(rdInt, ++n);
        }

        System.out.println(averageRelativeDeltaFromMean(map));

        for(int i = 0; averageRelativeDeltaFromMean(map) >= 0.01; i++) {
            int rdInt = rd.nextInt(10);
            map.put(i, rdInt);
        }

        System.out.println("Anzahl der berechneten Zahlen: "+map.values().size());
    }

    public static double averageRelativeDeltaFromMean(Map<Integer, Integer> map) {
        double avg = map
                .values()
                .stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);

        HashMap<Integer, Double> relAbsDeltaMap = new HashMap<>();
        map.forEach((k,v) -> relAbsDeltaMap.put(v, abs(v-avg)/avg));

        return relAbsDeltaMap
                .values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }
}
