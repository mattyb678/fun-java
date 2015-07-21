package chapter_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {

    public static void iterate_1 (final List<String> friends) {
        System.out.println("*** iterate_1 START");

        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        System.out.println("*** iterate_1 END");
    }

    public static void iterate_2 (final List<String> friends) {
        System.out.println("*** iterate_2 START");

        for (String name : friends) {
            System.out.println(name);
        }

        System.out.println("*** iterate_2 END");
    }

    public static void iterate_3 (final List<String> friends) {
        System.out.println("*** iterate_3 START");

        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("*** iterate_3 END");
    }

    public static void iterate_4 (final List<String> friends) {
        System.out.println("*** iterate_4 START");

        friends.forEach((final String name) -> System.out.println(name));

        System.out.println("*** iterate_4 END");
    }

    public static void iterate_5 (final List<String> friends) {
        System.out.println("*** iterate_5 START");

        friends.forEach((name) -> System.out.println(name));

        System.out.println("*** iterate_5 END");
    }

    public static void iterate_6 (final List<String> friends) {
        System.out.println("*** iterate_6 START");

        friends.forEach(name -> System.out.println(name));

        System.out.println("*** iterate_6 END");
    }

    public static void iterate_7 (final List<String> friends) {
        System.out.println("*** iterate_7 START");

        friends.forEach(System.out::println);

        System.out.println("*** iterate_7 END");
    }
}
