package OneFOlder;

import java.util.Arrays;
import java.util.List;

public class AllinAll {
    public static void main(String[] args) {
        List<String>Names= Arrays.asList("Safu","Sa","Fu","Ra");
        Names.stream().filter(Name->Name.length()>3)
                .forEach(System.out::println);
    }
}
