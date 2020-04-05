import java.util.Random;

public class Teacher {

    private String name;
    private String surname;

    private ClassRegister classRegister = new ClassRegister();
    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


public void rate (Student student, Homework homework){
    Random random = new Random();
    int grade = random.nextInt() %10 +1 ;
    classRegister.putGrade(student, homework, grade);
    System.out.println("Student + " + student.getFullname() + "for homework: " + homework + "got grade: " + grade);




}



}
