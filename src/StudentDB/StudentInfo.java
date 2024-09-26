package StudentDB;

public class StudentInfo {
    String name;
    int grade;
    int id;
    int age;
    String gender;

    public StudentInfo(int ID, String Name, String Gender, int Age, int Grade) {
        this.name = Name;
        this.grade = Grade;
        this.id = ID;
        this.age = Age;
        this.gender = Gender;
    }

    @Override
    public String toString() {
        return "id : " + id +
                " | name : " + name +
                " | gender : " + gender +
                " | age : " + age +
                " | grade : " + grade;
    }



    /*
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

     */
}
