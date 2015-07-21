package chapter_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PickElementsMultipleCollection {
    private static final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    private static final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
    private static final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

    public static void reuse_1 () {
        System.out.println("*** reuse_1 START");
        final long cntFriends =
            friends.stream().filter(name -> name.startsWith("N")).count();
        final long cntEditors =
            editors.stream().filter(name -> name.startsWith("N")).count();
        final long cntComrades =
            comrades.stream().filter(name -> name.startsWith("N")).count();
        System.out.println(
            String.format("Found %d friends, %d editors, %d comrades", cntFriends, cntEditors, cntComrades)
        );
        System.out.println("*** reuse_1 END");
    }

    public static void reuse_2 () {
        System.out.println("*** reuse_2 START");
        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final long cntFriends =
            friends.stream().filter(startsWithN).count();
        final long cntEditors =
            editors.stream().filter(startsWithN).count();
        final long cntComrades =
            comrades.stream().filter(startsWithN).count();
        System.out.println(
            String.format("Found %d friends, %d editors, %d comrades", cntFriends, cntEditors, cntComrades)
        );
        System.out.println("*** reuse_2 END");
    }
}
