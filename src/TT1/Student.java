package TT1;

public class Student extends Person{
    public int studentNumber;
    public double averageMark;

    public Student(String name, String phoneNumber, String emailAddress, Address address, int studentNumber, double averageMark) {
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll(String course) {
        // Eligibility logic for enrollment based on course
        return averageMark >= 50; // Example condition
    }

    public int getSeminarsTaken() {
        // Logic to calculate seminars taken
        return 5; // Example return value
    }
}
