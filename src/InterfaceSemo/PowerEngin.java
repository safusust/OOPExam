package InterfaceSemo;

public class PowerEngin implements engine{
    @Override
    public void start() {
        System.out.println("Power Engin Start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engin Stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Engin acc");
    }
}
