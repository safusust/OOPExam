package InterfaceSemo;

public class NiceCar {
    private engine Engine;
    private media Media;

    public NiceCar() {
        Engine=new PowerEngin();
        Media=new CdPlayer();
    }

    public NiceCar(engine Engine) {
        this.Engine = Engine;
    }
    public void start(){
        Engine.start();
    }
    public void stop(){
        Engine.stop();
    }
    public void acc(){
        Engine.acc();
    }
    public void musicStart(){
        Media.start();
    }
    public void musicStop(){
        Media.stop();
    }

}
