import java.util.List;
import java.util.stream.Collectors;

class FirstTask {

    private static final List <String> names = List.of
            ("Bohdan", "Tetiana", "Mykola", "Halyna",
                    "William", "Maria", "Denys");

    private static String namesPrinter() {
        return FirstTask.names.stream()
                .filter(name -> FirstTask.names.indexOf(name) % 2 != 0)
                .map(name -> FirstTask.names.indexOf(name) + ". " + name)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(namesPrinter());
    }
}