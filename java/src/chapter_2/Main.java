package chapter_2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        System.out.println("---------- Chapter 2 ----------");
        Iteration.iterate_1(friends);
        Iteration.iterate_2(friends);
        Iteration.iterate_3(friends);
        Iteration.iterate_4(friends);
        Iteration.iterate_5(friends);
        Iteration.iterate_6(friends);
        Iteration.iterate_7(friends);
        Transform.transform_1(friends);
        Transform.transform_2(friends);
        Transform.transform_3(friends);
        Transform.transform_4(friends);
        Transform.transform_5(friends);
        PickElements.pick_1(friends, "N");
        PickElements.pick_2(friends, "N");
        PickElementsMultipleCollection.reuse_1();
        PickElementsMultipleCollection.reuse_2();
        PickDifferentNames.duplicate_1(friends);
        PickDifferentNames.duplicate_2(friends);
        PickDifferentNames.duplicate_3(friends);
        PickDifferentNames.duplicate_4(friends);
        PickDifferentNames.duplicate_5(friends);
        PickAnElement.pickName(friends, "N");
        PickAnElement.pickName(friends, "Z");
        PickAnElementElegant.pickName(friends, "N");
        PickAnElementElegant.pickName(friends, "Z");
        PickALongest.totalChars(friends);
        PickALongest.longest(friends);
        PickALongest.longerThan(friends, "Steve");
        PickALongest.longerThan(friends, "Matt");
        PickALongest.longerThan(Arrays.asList(), "Steve");
        PrintList.print_1(friends);
        PrintList.print_2(friends);
        PrintList.print_3(friends);
        PrintList.print_4(friends);
    }
}
