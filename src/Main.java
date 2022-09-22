import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(16, 1, 8, 6, 22, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer n : nums) {
            if (n % 2 != 0) {
                System.out.print(n + ", ");
            }
        }
        System.out.println();

        Set<Integer> newNums = new HashSet<>(nums);
        for (Integer n : newNums) {
            if (n % 2 == 0) {
                System.out.print(n + ", ");
            }
        }
        System.out.println();

        List<String> cities = new ArrayList<>(List.of("Tokyo", "Delhi", "Shanghai",
                "Sao Paulo", "Delhi", "Mexico", "Mumbai",
                "Tokyo", "Delhi", "Osaka","Mumbai","Mumbai"));
        Set<String> newCities = new HashSet<>(cities);
        System.out.println(cities);
        System.out.println(newCities);

        Map<String, Integer> mapCities = new HashMap<String, Integer>();

        for (int i = 0; i < cities.size(); i++) {
            String c = cities.get(i);
            if (!mapCities.containsKey(c)) {
                mapCities.put(c, 1);
            } else {
                mapCities.put(c, mapCities.get(c)+1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapCities.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Город = "+entry.getKey()+ ", Повторений = " + entry.getValue());
            }
        }

        HashSet<String> citiesNoRepeats = new HashSet<>();
        HashSet<String> citiesRepeats = new HashSet<>();
        for (int i = 0; i < cities.size(); i++) {
            String c=cities.get(i);
            if (citiesNoRepeats.contains(c)) {
                citiesRepeats.add(c);
            } else {
                citiesNoRepeats.add(c);
            }
        }
        System.out.println("Повторения-"+citiesRepeats);
    }
}




