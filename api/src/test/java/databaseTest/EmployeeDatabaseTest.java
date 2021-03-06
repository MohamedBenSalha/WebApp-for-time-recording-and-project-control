package databaseTest;

import de.unistuttgart.sopra.Application;
import de.unistuttgart.sopra.databse.EmployeeDatabase;
import de.unistuttgart.sopra.entities.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.sql.SQLException;

/**
 * The objects created for testing are removed from the database immediately after the test.
 * Class that tests all functionalities of the class {@link EmployeeDatabase}
 */
public class EmployeeDatabaseTest {
    Application application;
    EmployeeDatabase employeeDatabase;

    @Before
    public void setUp() throws SQLException {
        application = new Application();
        employeeDatabase = new EmployeeDatabase(application.connectionSource);
    }

    /**
     * This method tests whether an object can be successfully added in the
     * database by checking after the insertion whether the employee
     * has been added to the list of all employees whether the data of the added
     * employee is stored in the correct columns.
     *
     * @throws SQLException if the employee has not been added
     */
    @Test
    public void addToDatabaseTest() throws SQLException {
        Employee employeeToAdd = new Employee("Assil", "Tunis", 40);
        employeeDatabase.addToDatabase(employeeToAdd);
       // Assert.assertEquals("6", employeeDatabase.getEmployee(employeeToAdd.getEmployeeID()).getProjectIDs());
        Assert.assertEquals("Assil", employeeDatabase.getEmployee(employeeToAdd.getEmployeeID()).getName());
        Assert.assertEquals("Tunis", employeeDatabase.getEmployee(employeeToAdd.getEmployeeID()).getDomicile());
        // checks that the employee exists in the database
        Assert.assertTrue(employeeDatabase.getAllEmployees().stream().anyMatch(employee -> employee.getEmployeeID()
                == (employeeToAdd.getEmployeeID())));
        employeeDatabase.deleteFromDatabase(employeeToAdd.getEmployeeID());
    }

    /**
     * This method tests whether an object can be successfully modified in the
     * database by checking after the modification whether the new data of the employee has
     * been saved in the database and the old one has been overwritten.
     */
    @Test
    public void modifyEmployeeDataTest() throws SQLException {
        Employee employeeToModify = new Employee("Test", "Tunis",  40);
        employeeDatabase.addToDatabase(employeeToModify);
        assertEquals("Tunis", employeeToModify.getDomicile());
        employeeToModify.setDomicile("Stuttgart");
        //employeeToModify.addProject(5);
        employeeDatabase.modifyEmployeeData(employeeToModify);
         assertEquals("Stuttgart", employeeToModify.getDomicile());
        assertNotEquals("Tunis", employeeToModify.getDomicile());
        employeeDatabase.deleteFromDatabase(employeeToModify.getEmployeeID());
    }

    /**
     * This method tests whether an object can be successfully deleted from the
     * database by checking after the deletion whether the employee
     * exists in the database
     *
     * @throws SQLException if the employee has not been deleted
     */
    @Test
    public void deleteEmployeeDataTest() throws SQLException {
        Employee employeeToDelete = new Employee("Test", "Tunis",  40);
        employeeDatabase.addToDatabase(employeeToDelete);
        // checks that the employee exists in the database
        Assert.assertTrue(employeeDatabase.getAllEmployees().stream().anyMatch(employee -> employee.getEmployeeID() == (employeeToDelete.getEmployeeID())));        employeeDatabase.deleteFromDatabase(employeeToDelete.getEmployeeID());
        // checks that the employee does not exist in the database
        employeeDatabase.deleteFromDatabase(employeeToDelete.getEmployeeID());
        Assert.assertFalse(employeeDatabase.getAllEmployees().stream().anyMatch(employee -> employee.getEmployeeID() == (employeeToDelete.getEmployeeID())));
    }

}
