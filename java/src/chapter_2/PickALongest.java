package chapter_2;

import java.util.List;
import java.util.Optional;

public class PickALongest {
    public static void totalChars (final List<String> names) {
        System.out.println("*** totalChars START");
        System.out.println("Total number of characters in all names: " +
            names.stream()
                .mapToInt(name -> name.length())
                .sum());
        System.out.println("*** totalChars END");
    }

    public static void longest (final List<String> names) {
        System.out.println("*** longest START");
        final Optional<String> aLongName =
            names.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));
        System.out.println("*** longest END");
    }

    public static void longerThan (final List<String> names, String base) {
        System.out.println("*** longerThan START");
        final String baseOrLonger =
            names.stream()
                .reduce(base, (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        System.out.println(String.format("Longest name: %s", baseOrLonger));
        System.out.println("*** longerThan END");
    }
}
