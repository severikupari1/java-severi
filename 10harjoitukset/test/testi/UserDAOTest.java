/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testi;

import JunitSeveri.ProjectManagementController;
import JunitSeveri.Users;
import JunitSeveri.UserDAO;
import JunitSeveri.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s704383
 */
public class UserDAOTest {
    
    public UserDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() throws SQLException {
        
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() throws SQLException {
        
    }

    /**
     * Test of getUsers method, of class UserDAO.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserDAO instance = new UserDAO();
        Users expResult = null;
        Users result = instance.getUsers();
        // Testaa että ei ole tyhjä mitä palautetaan
        assertNotEquals(expResult, result);
    }

    /**
     * Test of saveUser method, of class UserDAO.
     */
    @Test
    public void testSaveUser() {
        ProjectManagementController pmc = new ProjectManagementController();
        System.out.println("saveUser");
        User u = new User();
        u.setName("unitTest");
        u.setPassword("unitTestPassword");
        u.setDescription("unitTestDesc");
        pmc.saveUser(u);
        
        User expResult = new User();
        expResult.setName("unitTest");
        expResult.setPassword("unitTestPassword");
        expResult.setDescription("unitTestDesc");
        
        User result = pmc.getUser(u);
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getPassword(), result.getPassword());
        assertEquals(expResult.getDescription(), result.getDescription());
        
        pmc.deleteUser(result);
    }

    /**
     * Test of deleteUser method, of class UserDAO.
     */
    @Test
    public void testDeleteUser() {
        ProjectManagementController pmc = new ProjectManagementController();
        System.out.println("saveUser");
        User u = new User();
        u.setName("unitTest");
        u.setPassword("unitTestPassword");
        u.setDescription("unitTestDesc");
        pmc.saveUser(u);
        User result = pmc.getUser(u);
        
        assertEquals(pmc.deleteUser(result), u);
    }

    /**
     * Test of getUser method, of class UserDAO.
     */
    @Test
    public void testGetUser() {
        ProjectManagementController pmc = new ProjectManagementController();
        System.out.println("saveUser");
        User u = new User();
        u.setName("unitTest");
        u.setPassword("unitTestPassword");
        u.setDescription("unitTestDesc");
        pmc.saveUser(u);
        User result = pmc.getUser(u);
        
        assertEquals(result, u);
        pmc.deleteUser(result);
    }
    
}
