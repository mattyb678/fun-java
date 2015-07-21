package chapter_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickElements {

    public static void pick_1 (final List<String> friends, String startsWith) {
        System.out.println("*** pick_1 START");
        final List<String> startsWithN = new ArrayList<>();
        for (String name : friends) {
            if (name.startsWith(startsWith)) {
                startsWithN.add(name);
            }
        }
        System.out.println(startsWithN);
        System.out.println("*** pick_1 END");
    }

    public static void pick_2 (final List<String> friends, String startsWith) {
        System.out.println("*** pick_2 START");
        final List<String> startsWithList =
            friends.stream()
                .filter(name -> name.startsWith(startsWith))
                .collect(Collectors.toList());
        System.out.println(startsWithList);
        System.out.println(String.format("Found %d names", startsWithList.size()));
        System.out.println("*** pick_2 END");
    }
}
