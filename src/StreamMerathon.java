import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMerathon {

    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList
            .stream()
            .filter(s -> s.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);  // a1

        IntStream.range(1, 4)
                .forEach(System.out::println);

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);  // 5.0

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);  // 3

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

//        An important characteristic of intermediate operations is laziness. Look at this sample where a terminal operation is missing:

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });
//        When executing this code snippet, nothing is printed to the console. That is because intermediate operations will only be executed when a terminal operation is present.

//                Let's extend the above example by the terminal operation forEach:

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
