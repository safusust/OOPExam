package genericDemo.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student safu=new Student(95.5,53);
        Student rahul=new Student(55.5,5);
        Student a=new Student(65.5,1);
        Student b=new Student(75.5,3);

        Student[] list={safu,rahul,a,b};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
//        if(safu.compareTo(rahul)>0){
//            System.out.println("Safu's mark is greater than rahul");
//
//        }
    }
}
