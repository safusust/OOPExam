package genericDemo.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LamdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer>arr= new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i);
        }
    //    arr.forEach((item)-> System.out.println(item*2));
        arr.forEach((item)-> System.out.println(item*2));

    }
    int sum(int a, int b){
        return a+b;
    }
}



