package genericDemo;

public class Main <T>implements GenericIn<T>{
    T val;
    @Override
    public void display(T valu) {
        this.val=valu;
        System.out.println(val);
    }

    public static void main(String[] args) {
        Main<String>s=new Main<>();
        s.display("Safu love");
    }
}
