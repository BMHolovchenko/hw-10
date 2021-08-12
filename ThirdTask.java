import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ThirdTask {

    private static final String [] rawData = {"1, 2, 0", "4, 5"};
    private static final List <String> numbers = List.of(rawData);


    private static String sorter(){
        return ThirdTask.numbers.stream()
                .flatMap(number -> Arrays.stream((number.split(", "))))
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(sorter());
    }
}
