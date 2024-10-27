package genericDemo.comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    double marks;

    public Student(double marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return  marks+" ";
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.marks, o.marks); // Using Double.compare to avoid truncation issues
    }
}