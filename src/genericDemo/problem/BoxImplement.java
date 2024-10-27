package genericDemo.problem;

public class BoxImplement <T> implements BoxInterface <T> {
    private T iteam1;
    private T iteam2;
    @Override
    public void a(T iteam) {
        iteam1=iteam;
        System.out.println(iteam1);
    }

    @Override
    public void b(T desh) {
        iteam2=desh;
        System.out.println(iteam2);
    }
}
