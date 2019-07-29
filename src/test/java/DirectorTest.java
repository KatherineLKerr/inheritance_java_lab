import org.junit.Before;
import org.junit.Test;
import staff.management.Director;;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void setUp() {
        director = new Director("yetanothername", "192837", 30000.00, "all of them",100000.00);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000.00);
        assertEquals(35000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(300.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetName() {
        assertEquals("yetanothername", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("192837", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("all of them", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000.00, director.getBudget(), 0.01);
    }
}
