public class Student
{
    private double gpa;
    private String studentID;
    private String name;
    private int age;

    public Student(String name, String StudentID, int age)
    {
        this.gpa = 0.0;
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }

    public static void main(String[] args)
    {
        Student casey = new Student("Casey","672875",17);
        System.out.println(casey);
    }
}