package AI;

public class StudentInfo {
    String name;
    int grade;
    int id;
    int age;
    String gender;

    public StudentInfo(int id, String name, String gender, int age, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "id : " + id +
                " | name : " + name +
                " | gender : " + gender +
                " | age : " + age +
                " | grade : " + grade;
    }
}