package chapter_1;

import java.util.Arrays;
import java.util.List;

public class Cities {
    private static List<String> cities = Arrays.asList("SLC", "Denver", "Chicago", "NYC", "Madrid", "London");

    public static boolean findCityImperative (String toFind) {
        boolean found = false;
        for (String city : cities) {
            if (city.equals(toFind)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean findCityDeclarative (String toFind) {
        return cities.contains(toFind);
    }
}
