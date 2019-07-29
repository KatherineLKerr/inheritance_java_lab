import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("andanothername", "98765", 30000.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(300.00, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canGetName() {
        assertEquals("andanothername", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("98765", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
    }
}
