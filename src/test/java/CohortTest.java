import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;


public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWOne;
    Cohort cohortWMany;

    @Before
    public void init() {
        emptyCohort = new Cohort();
        cohortWOne = new Cohort();
        cohortWMany = new Cohort();
    }

    @Test
    public void testIfAddStudentWorks() {
        assertEquals(0, cohortWOne.getStudents().size());
        Student john = new Student(1L, "John");
        cohortWOne.addStudent(john);
        assertEquals(1, cohortWOne.getStudents().get(0).size());
    }

    @Test
    public void testIfGeStudentsWork() {
        Student john = new Student(1L, "John");
        Student david = new Student(2L, "David");
        cohortWMany.addStudent(john);
        cohortWMany.addStudent(david);
//        cohortWMany.getStudents().get(0).getID();
        assertEquals(10, cohortWMany.getStudents().get(0).getID());
        assertEquals(20, cohortWMany.getStudents().get(1).getID());
    }

}
