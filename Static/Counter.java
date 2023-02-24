import javax.lang.model.util.ElementScanner14;

// In this program is shown how the static methods works
// In this case we simulate a counter for the students that are in the school
public class Counter {

    int studentsNumber;
    static int studentsCount;

    public static String add(int studentsNumber) {
        studentsCount = studentsCount + studentsNumber;
        return "The number of students in the school is = " + studentsCount;
    }

    public static String substract(int studentsNumber) {
        // We check if there are enoght students to substact the quantity provided
        if (studentsCount - studentsNumber < 0) {
            System.out.println("There is no more students to substract");
            return "The number of students at the school is = " + studentsCount;
        } else {
            studentsCount = studentsCount - studentsNumber;
            return "The number of students at the school is = " + studentsCount;
        }

    }

}
