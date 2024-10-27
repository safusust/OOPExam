package InterfaceSemo.nestedDemo;

public class A {
    public interface b{
        boolean isOdd(int n);
    }
}
class B implements A.b{

    @Override
    public boolean isOdd(int n) {
        return (n&1)==1;
    }
}
