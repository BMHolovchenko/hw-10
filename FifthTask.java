import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FifthTask {

        private static final List<String> first = Arrays.asList("One", "Two", "Three", "Four", "Five");
        private static final List<String> second = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");


        public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
            List<T> mixedData = Stream.concat(first, second).collect(Collectors.toList());
            Collections.shuffle(mixedData);
            return mixedData.stream();

        }

    public static void main(String[] args) {
        System.out.println((zip(first.stream(), second.stream()))
                .collect(Collectors.joining(", ")));


    }

    }
