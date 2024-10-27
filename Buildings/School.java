package Buildings;

public class School extends Building  {
    private int maxStudents;
    private Student[] students;
    private int studentCount;
    private int teachers;

    public School(int drainageSystem, int electricity, int maxStudents, int teachers){
        super(drainageSystem, electricity);
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
        this.teachers = teachers;
        this.studentCount = 0;
    }

    public int getStudentCount(){
        return maxStudents;
    }

    public int getTeachers() {
        return teachers;
    }

    public void addStudent(String firstname, String lastname, int age){
        if(studentCount < maxStudents){
            students[studentCount++] = new Student(firstname, lastname, age);
            System.out.println("Student" + firstname + " " + lastname + " " + age + " added " );
        } else {
            System.out.println("No more space available ");
        }
    }
}


