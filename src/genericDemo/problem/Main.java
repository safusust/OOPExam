package genericDemo.problem;

public class Main {
    public static void main(String[] args) {
        Box<String> Box1=new Box<>();
        Box1.setContent("Joy Bangla");
        System.out.println(Box1.getContent());
        Box<Integer>Box2=new Box<>();
        Box2.setContent(12000);
        System.out.println(Box2.getContent());
        BoxImplement<String>s=new BoxImplement<>();
        s.a("JOyyyyyy");
        s.b("Bangla");
        BoxImplement<Integer>i=new BoxImplement<>();
        i.a(222);
        i.b(2233333);
    }
}
