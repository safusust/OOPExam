package InterfaceSemo;

public class ElectricEngin implements engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Acc");
    }
}
