package chapter_2;

import java.util.List;
import java.util.Optional;

public class PickAnElementElegant {
    public static void pickName (final List<String> names, final String startingLetter) {
        System.out.println("*** elegant pickName START");
        final Optional<String> foundName =
            names.stream()
                .filter(name -> name.startsWith(startingLetter))
                .findFirst();

        System.out.println(String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
        foundName.ifPresent(name -> System.out.println("Hello " + name));
        System.out.println("*** elegant pickName END");
    }
}
