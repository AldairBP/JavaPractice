public class Main {
    public static void main(String[] args) {
        // Creating three students
        Student s1 = new Student("Natalia McFly", 8.5f);
        System.out.println(s1.getName() + "´s Id is " + s1.getId() + " and it´s grade = " + s1.getGrade());
        Student s2 = new Student("Nachito Escalera", 9.9f);
        System.out.println(s2.getName() + "´s Id is " + s2.getId() + " and it´s grade = " + s2.getGrade());
        Student s3 = new Student("Alejandro Madopavo", 7.1f);
        System.out.println(s3.getName() + "´s Id is " + s3.getId() + " and it´s grade = " + s3.getGrade());
        System.out.println("-----------------------------------------");
        // Setting the new grade to s1
        s1.setGrade(9.5f);
        System.out.println(s1.getName() + "'s updated grade is " + s1.getGrade());

    }
}
