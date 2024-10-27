package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son obj= new Son(21);
        obj.career("Doctor");
        obj.partner("Sadia",18);
        obj.ismaried=true;
        obj.maritalStatus(obj.ismaried);

        Parent mom=new Parent() {
            @Override
            void career(String name) {
                System.out.println(name);
            }

            @Override
            void partner(String name, int age) {
                System.out.println(name+age);
            }
        };
    }

}
