package genericDemo.lamda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Greeting sum=((a, b) -> System.out.println(a+b) );
        sum.operator(5,6);
        Greeting sub=((a,b)-> System.out.println(a-b));
        sub.operator(10,5);
        List<Integer> as= Arrays.asList(1, 2, 3, 4, 56666);
        as.stream()
                .filter(n->n>3)
                .forEach(System.out::println);
    }
}
