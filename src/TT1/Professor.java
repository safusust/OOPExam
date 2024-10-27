package TT1;

public class Professor extends Person{
    public int salary;
    public int staffNumber;
    public int yearsOfService;
    public int numberOfClasses;

    public Professor(String name, String phoneNumber, String emailAddress, Address address, int salary, int staffNumber, int yearsOfService, int numberOfClasses) {
        super(name, phoneNumber, emailAddress, address);
        this.salary = salary;
        this.staffNumber = staffNumber;
        this.yearsOfService = yearsOfService;
        this.numberOfClasses = numberOfClasses;
    }

    public void supervise(Student student) {
        // Logic for supervising a student
        System.out.println("Supervising student: " + student.studentNumber);
    }
}
