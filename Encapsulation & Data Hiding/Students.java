public class Students {
    // Protecting the data by using the access modifier "private"
    private static int id = 2302000;
    private String name;
    private float grade;

    // Generating a constructor
    public Students(String name, float grade) {
        id++;
        this.name = name;
        this.grade = grade;

    }

    // Assuming that an Id is generated only once when the object is created, we
    // create only the getter to obtain the value
    public static int getId() {
        return id;
    }

    // Getter and setter of the Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // // Getter and setter of the Name
    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

}