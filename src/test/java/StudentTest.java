import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentObjectCanBeCreated() {
        Student john = new Student(1L, "John");
        Student david = null;
//        System.out.println(john);
        assertNotNull(john);
        assertNull(david);
    }

    @Test
    public void testIfFieldWork() {
        Student john = new Student(1L, "John");
        assertEquals(1, john.getId());
        assertEquals("John", john.getName());
        assertNotNull(john.getGrades());

        Student david = new Student(2L, "David");
        assertNotEquals("Steve", david.getName());
    }

    @Test
    public void tesIfAddGradeWorks() {
        Student john = new Student(1L, "John");
        assertEquals(0, john.getGrades().size());
        john.addGrade(100);
        assertEquals(1, john.getGrades().size());
        john.addGrade(70);
        assertEquals(2, john.getGrades().size());

//        john.getGrades().get(0);
        assertEquals(100, (int) john.getGrades().get(0));
        assertEquals(70, (int) john.getGrades().get(1));
    }

    @Test public void testIfGetGradeAverageWorks() {
//        john.getGradeAverage();
        Student john = new Student(1L, "John");
        john.addGrade(90);
        john.addGrade(80);
        assertEquals(0, john.getGradeAverage(), 0);
        john.addGrade(60);
        assertEquals(60, john.getGradeAverage(), 0);
    }

}
