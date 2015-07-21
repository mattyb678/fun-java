package chapter_2;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class PrintList {
    public static void print_1 (final List<String> names) {
        System.out.println("*** print_1 START");
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println();
        System.out.println("*** print_1 END");
    }

    public static void print_2 (final List<String> names) {
        System.out.println("*** print_2 START");
        for (int i = 0; i < names.size() - 1; i++) {
            System.out.print(names.get(i) + ", ");
        }
        if (names.size() > 0) {
            System.out.println(names.get(names.size() - 1));
        }
        System.out.println("*** print_2 END");
    }

    public static void print_3 (final List<String> names) {
        System.out.println("*** print_3 START");
        System.out.println(String.join(", ", names));
        System.out.println("*** print_3 END");
    }

    public static void print_4 (final List<String> names) {
        System.out.println("*** print_4 START");
        System.out.println(
            names.stream()
                .map(String::toUpperCase)
                .collect(joining(", "))
        );
        System.out.println("*** print_4 END");
    }
}
