public class Main {
    public static void main(String[] args) {
        // As well as we create an object we print their values to show how the id
        // increases
        Student s1 = new Student("Natalia", 20);
        System.out.println(s1);
        Student s2 = new Student("Nachito", 24);
        System.out.println(s2);
        Student s3 = new Student("Maldopavo", 26);
        System.out.println(s3);

        System.out.println("--------------------------------------------");

        // In this section we create 4 counter objects simulating that each hour
        // have a counter register
        Counter hour1 = new Counter();
        Counter hour2 = new Counter();
        Counter hour3 = new Counter();
        Counter hour4 = new Counter();

        System.out.println(hour1.add(10));
        System.out.println(hour2.add(12));
        System.out.println(hour3.add(22));
        System.out.println(hour4.add(30));
        System.out.println(hour4.substract(90));

    }
}
