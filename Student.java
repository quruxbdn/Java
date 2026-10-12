public class Student extends Person {
    private double gpa;

    public Student(String name, int id, double gpa) {
        super(name, id);          // call the parent constructor first
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }
}
