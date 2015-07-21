package chapter_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PickDifferentNames {

    public static void duplicate_1 (final List<String> friends) {
        System.out.println("*** duplicate_1 START");
        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final Predicate<String> startsWithB = name -> name.startsWith("B");

        final long cntFriendsN =
            friends.stream().filter(startsWithN).count();
        final long cntFriendsB =
            friends.stream().filter(startsWithB).count();

        System.out.println(
            String.format("%d startWith N, %d startWith B", cntFriendsN, cntFriendsB)
        );

        System.out.println("*** duplicate_1 START");
    }

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }

    public static void duplicate_2 (final List<String> friends) {
        System.out.println("*** duplicate_2 START");

        final long cntFriendsN =
                friends.stream().filter(checkIfStartsWith("N")).count();
        final long cntFriendsB =
                friends.stream().filter(checkIfStartsWith("B")).count();

        System.out.println(
            String.format("%d startWith N, %d startWith B", cntFriendsN, cntFriendsB)
        );
        System.out.println("*** duplicate_2 END");
    }

    public static void duplicate_3 (final List<String> friends) {
        System.out.println("*** duplicate_3 START");
        final Function<String, Predicate<String>> startsWithLetter =
            (String letter) -> {
                Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
                return checkStarts;
            };

        final long cntFriendsN =
            friends.stream().filter(startsWithLetter.apply("N")).count();
        final long cntFriendsB =
            friends.stream().filter(startsWithLetter.apply("B")).count();

        System.out.println(
            String.format("%d startWith N, %d startWith B", cntFriendsN, cntFriendsB)
        );

        System.out.println("*** duplicate_3 END");
    }

    public static void duplicate_4 (final List<String> friends) {
        System.out.println("*** duplicate_4 START");
        final Function<String, Predicate<String>> startsWithLetter =
            (String letter) -> (String name) -> name.startsWith(letter);

        final long cntFriendsN =
            friends.stream().filter(startsWithLetter.apply("N")).count();
        final long cntFriendsB =
            friends.stream().filter(startsWithLetter.apply("B")).count();

        System.out.println(
            String.format("%d startWith N, %d startWith B", cntFriendsN, cntFriendsB)
        );

        System.out.println("*** duplicate_4 END");
    }

    public static void duplicate_5 (final List<String> friends) {
        System.out.println("*** duplicate_5 START");
        final Function<String, Predicate<String>> startsWithLetter =
            letter -> name -> name.startsWith(letter);

        final long cntFriendsN =
            friends.stream().filter(startsWithLetter.apply("N")).count();
        final long cntFriendsB =
            friends.stream().filter(startsWithLetter.apply("B")).count();

        System.out.println(
            String.format("%d startWith N, %d startWith B", cntFriendsN, cntFriendsB)
        );

        System.out.println("*** duplicate_5 END");
    }
}
