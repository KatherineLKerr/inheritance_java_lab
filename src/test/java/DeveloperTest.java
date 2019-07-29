import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("anothername", "12345", 30000.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000.00);
        assertEquals(35000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(300.00, developer.payBonus(), 0.01);
    }

    @Test
    public void canGetName() {
        assertEquals("anothername", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("12345", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }
}
