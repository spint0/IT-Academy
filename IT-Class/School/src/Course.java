public class Course {

private Lessons[] Lessons;

private Student[] Students;

private Teacher teacher;

public void start(){

    for (Lessons lesson : Lessons){
        lesson.run(teacher, Students);
    }
}


}
