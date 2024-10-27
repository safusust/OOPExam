package InterfaceSemo;

public class CdPlayer implements media{
    @Override
    public void start() {
        System.out.println("Cd Player Start");
    }

    @Override
    public void stop() {
        System.out.println("Cd Player Stop");
    }
}
