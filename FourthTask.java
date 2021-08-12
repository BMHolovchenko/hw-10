import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FourthTask {

    public static List <Long> generator (long seed, long a, long c, long m) {
        return Stream.iterate(seed, b -> (a * b + c) % m)
                .limit(10)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(FourthTask.generator(0L, 25214903917L, 11, (long) Math.pow(2, 48)));
    }
}
