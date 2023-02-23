// In this program is shown how the static methods works
// In this case we simulate a counter for the students that are in the school
public class Counter {
    static int count;

    public Counter() {
        System.out.println("The number of students in the school is = ");
    }

    public static int add() {
        return count++;
    }

    public static int substract() {
        return count--;
    }

}
