package databaseTest;

import de.unistuttgart.sopra.Application;
import de.unistuttgart.sopra.databse.ClientDatabase;
import de.unistuttgart.sopra.entities.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

/**
 * The objects created for testing are removed from the database immediately after the test.
 * Class that tests all functionalities of the class {@link ClientDatabase}
 */
public class ClientDatabaseTest {
    Application application;
    ClientDatabase clientDatabase;

    @Before
    public void setUp() throws SQLException {
        application = new Application();
        clientDatabase = new ClientDatabase(application.connectionSource);
    }

    /**
     * This method tests whether an object can be successfully created in the
     * database by checking after the insertion whether the ID of the client
     * occurs in the list of IDs of all clients
     * @throws SQLException if the client has not been added
     */
    @Test
    public void addToDatabaseTest() throws SQLException {
        Client clientToAdd = new Client("TEST", "test@test.de", "1597536482", 2, "Stuttgart");
        clientDatabase.addToDatabase(clientToAdd);
        Assert.assertTrue(clientDatabase.getAllClients().stream().anyMatch(client -> client.getClientID().equals(clientToAdd.getClientID())));
        clientDatabase.deleteFromDatabase(clientToAdd.getClientID());
        Assert.assertFalse(clientDatabase.getAllClients().stream().anyMatch(client -> client.getClientID().equals(clientToAdd.getClientID())));

    }

    @Test(expected = NullPointerException.class)
    public void addToDatabaseFailTest() throws SQLException {
        clientDatabase.addToDatabase(null);
    }

    /**
     * This method tests whether an object can be successfully modified in the
     * database by checking after the modification whether the new data of the client has
     * been saved in the database and the old one has been overwritten.
     */
    @Test
    public void modifyClientDataTest() throws SQLException {
        Client clientToModify = new Client("Test", "test@web.de", "12345678", 6, "Feuerbach");
        clientDatabase.addToDatabase(clientToModify);
        Assert.assertEquals("test@web.de", clientToModify.getEmail());
        Assert.assertEquals("12345678", clientToModify.getTelephoneNumber());
        // Assert.assertEquals(1, clientToAdd.getContactPersonID());
        clientToModify.setContactPersonID(2);
        clientToModify.setAddress("Fellbach");
        clientToModify.setEmail("testtest@web.de");
        clientToModify.setTelephoneNumber("789987789");
        clientDatabase.modifyClientData(clientToModify);
        // amazon = clientDatabase.getClient(1);
        Assert.assertEquals("testtest@web.de", clientToModify.getEmail());
        Assert.assertEquals("789987789", clientToModify.getTelephoneNumber());
        Assert.assertEquals(2, clientToModify.getContactPersonID());
        Assert.assertEquals("Fellbach",clientToModify.getAddress());
        clientDatabase.deleteFromDatabase(clientToModify.getClientID());
    }

    /**
     * This method tests whether an object can be successfully deleted from the
     * database by checking after the deletion the deleted element in the list
     * of all employees still exists.
     *
     * @throws SQLException if the client has not been deleted
     */
    @Test
    public void deleteFromDatabaseTest() throws SQLException {
        Client clientToDelete = new Client("Test", "test@web.de", "12345678", 6, "Bietigheim");
        clientDatabase.addToDatabase(clientToDelete);
        Assert.assertTrue(clientDatabase.getAllClients().stream().anyMatch(client -> client.getClientID().equals(clientToDelete.getClientID())));
        clientDatabase.deleteFromDatabase(clientToDelete.getClientID());
        Assert.assertFalse(clientDatabase.getAllClients().stream().anyMatch(client -> client.getClientID().equals(clientToDelete.getClientID())));


    }
}
