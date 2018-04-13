/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitSeveri;

import java.sql.*;

/**
*
* @author s704383
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
                u.setDescription(rs.getString("Name"));
                u.setName(name); 
                urs.add(u);
                //System.out.println("User's name was " + name);
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
    
    
        public User saveUser(User u) {
        Connection connect = null;
        
        try {
            String url = "jdbc:mysql://webo.savonia.fi:3306/codez_etp4100_s2016_project";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, "project_admin", "adminadmin");
            if (!connect.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt = connect.createStatement();
            String sql = "INSERT INTO user (Name, Password, Description) " + "VALUES ('" + u.getName() + "','" + u.getPassword() + "','" + u.getDescription() + "');";
            stmt.executeUpdate(sql);
            
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
        return u;
    }
        
    public User deleteUser(User u) {
        Connection connect = null;
        
        try {
            String url = "jdbc:mysql://webo.savonia.fi:3306/codez_etp4100_s2016_project";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, "project_admin", "adminadmin");
            if (!connect.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt = connect.createStatement();
            String sql = "DELETE FROM user WHERE name='" + u.getName() + "';";
            stmt.executeUpdate(sql);
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
        return u;
    }
    
    public User getUser(User u) {
        Connection connect = null;
        
        try {
            String url = "jdbc:mysql://webo.savonia.fi:3306/codez_etp4100_s2016_project";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, "project_admin", "adminadmin");
            if (!connect.isClosed()) {
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt = connect.createStatement();
            String sql = "SELECT * FROM user WHERE name='" + u.getName() + "';";
            stmt.executeQuery(sql);
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
        return u;
    }
}
