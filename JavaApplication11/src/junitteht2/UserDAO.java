/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vtkinju
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
*
* @author vtkinju
*/
public class UserDAO {

    public Users getUsers() {
        Users urs = new Users();
        User u;
        Connection connect = null;
            
        try {
            String url = "jdbc:mysql://webo.savonia.fi:3306/codez_etp4100_s2016_project";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, "project_admin", "adminadmin");
            if (!connect.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            while (rs.next()) {
                u = new User();
                u.setId(rs.getInt("ID"));
                String name = rs.getString("Name");
                u.setPassword(rs.getString("Password"));
                u.setDescription(rs.getString("Description"));
                u.setName(name); 
                urs.add(u);
                System.out.println("User's name was " + name);

            }
        }
        catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
        } finally {
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                //---------------------------
            }

        }
        return urs;

    }
    
    public Users addUser(String nimi, String salasana, String kuvaus) {
        Users urs = new Users();
        User u;
        Connection connect = null;
            
        try {
            String url = "jdbc:mysql://webo.savonia.fi:3306/codez_etp4100_s2016_project";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, "project_admin", "adminadmin");
            if (!connect.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt = connect.createStatement();
            int rs = stmt.executeUpdate("INSERT INTO User (Name, Password, Description) VALUES ('" + nimi + "','" + salasana + "','" + kuvaus + "')");
            
        }
        catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
        } finally {
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                //---------------------------
            }

        }
        return urs;

    }
    
        public void deleteUser(int id) {

        Connection connect = null;
            
        try {
            String url = "jdbc:mysql://webo.savonia.fi:3306/codez_etp4100_s2016_project";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, "project_admin", "adminadmin");
            if (!connect.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt = connect.createStatement();
            int rs = stmt.executeUpdate("DELETE  FROM User WHERE Id = " + id);
            
        }
        catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
        } finally {
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                //---------------------------
            }

        }
        return;

    }
        
    public void updateUser(User u) {
        Connection connect = null;      
        try {
            String url = "jdbc:mysql://webo.savonia.fi:3306/codez_etp4100_s2016_project";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, "project_admin", "adminadmin");
            if (!connect.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt = connect.createStatement();
            String stm = "UPDATE User SET"
                    + " Name = '" + u.getName() + "', "  
                    + " Password = '" + u.getPassword()+ "', "  
                    + " Description = '" + u.getDescription() + "' "  
                    + " WHERE Id = " + u.getId();
            System.out.println(stm);
            int rs = stmt.executeUpdate(stm);
            
        }
        catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
        } finally {
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                //---------------------------
            }

        }
        return;

    }
}
