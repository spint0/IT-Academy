public class ClassRegister {

    private int Gradecounts =0;
    private Grade[] grades = new Grade[1000];

    public void putGrade(Student student, Homework homework, int grade) {
    Grade newGrade = new Grade(student, homework, grade); // Create new Grade
    grades[Gradecounts] = newGrade;                     // put it into the array
    Gradecounts++;                                      // add one to the count of our grades


    }
}
