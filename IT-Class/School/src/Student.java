public class Student {

    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullname() {
        return name + " " + surname;
    }
}
