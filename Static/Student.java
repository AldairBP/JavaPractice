// In this program is shown how the static variables works

public class Student {
    String name;
    int age;
    static int id = 100; // We declare a static variable that belongs to the class and not to the object

    public Student(String name, int age) {
        id++; // The variable increases each time we call to the constructor
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id = " + id + ", name = " + this.name + ", age = " + this.age + "]";
    }

}