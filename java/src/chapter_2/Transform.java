package chapter_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transform {

    public static void transform_1 (final List<String> friends) {
        System.out.println("*** transform_1 START");
        final List<String> uppercaseNames = new ArrayList<>();

        for (String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }

        System.out.println(uppercaseNames);
        System.out.println("*** transform_1 END");
    }

    public static void transform_2 (final List<String> friends) {
        System.out.println("*** transform_2 START");
        final List<String> uppercaseNames = new ArrayList<>();
        friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
        System.out.println(uppercaseNames);
        System.out.println("*** transform_2 END");
    }

    public static void transform_3 (final List<String> friends) {
        System.out.println("*** transform_3 START");
        friends.stream()
            .map(name -> name.toUpperCase())
            .forEach(name -> System.out.print(name + " "));
        System.out.println();
        System.out.println("*** transform_3 END");
    }

    public static void transform_4 (final List<String> friends) {
        System.out.println("*** transform_4 START");
        friends.stream()
            .map(name -> name.length())
            .forEach(count -> System.out.print(count + " "));
        System.out.println();
        System.out.println("*** transform_4 END");
    }

    public static void transform_5 (final List<String> friends) {
        System.out.println("*** transform_5 START");
        friends.stream()
            .map(String::toUpperCase)
            .forEach(name -> System.out.println(name));
        System.out.println("*** transform_5 END");
    }
}
