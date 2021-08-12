import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SecondTask {

    private static final List <String> names = List.of
            ("Bohdan", "Tetiana", "Mykola", "Halyna",
                    "William", "Maria", "Denys");

    private static String namesPrinter() {
        return SecondTask.names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(namesPrinter());
    }
}