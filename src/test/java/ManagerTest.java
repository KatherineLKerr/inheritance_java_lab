import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("idk", "12345", 30000.00, "whatever");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(35000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(300.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("whatever", manager.getDeptName());
    }

    @Test
    public void cantRaiseSalaryWhenLessThanZero() {
        manager.raiseSalary(-100.00);
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }
}
