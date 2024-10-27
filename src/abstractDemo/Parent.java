package abstractDemo;
// You cant create a object of abstract class , abstract constructor ,abstract static method, final
// You can create constructor ,method ,attribute,static method
//
 public abstract class Parent {
    int age;

    public Parent(){

    }
    public Parent(int age) {
        this.age=age;
    }

    abstract void career(String name);
    abstract void partner(String name, int age);

    void maritalStatus(boolean ismaried){
        System.out.println("He is Marite ? : "+ismaried);
    }
 }
