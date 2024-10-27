package abstractDemo;

public class Son extends Parent{

    Son(int age){
        super();
    }

    boolean ismaried;
    @Override
    void career(String name) {
        System.out.println("I want to be a "+name);
    }
    @Override
    void partner(String name,int age){
        System.out.println("I love "+name+" she is "+age);
    }
    @Override
    void maritalStatus(boolean ismaried){
        this.ismaried=ismaried;
        System.out.println("He is Marite ? : "+ismaried);
    }
}
