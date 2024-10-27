package InterfaceSemo.extendDemo2;

import InterfaceSemo.extend.A;

public interface B extends A {
    void greet();
    default void fun(){
        System.out.println("I am in a ");
    }

}
