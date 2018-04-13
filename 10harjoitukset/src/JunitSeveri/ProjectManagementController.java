/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JunitSeveri;



public class ProjectManagementController {
    public Users getUsers() {
        return new UserDAO().getUsers();
    }
    public User saveUser(User u){
        return new UserDAO().saveUser(u);
    }
   
    public User deleteUser(User u){
        return new UserDAO().deleteUser(u);
    }
    
    public User getUser(User u){
        return new UserDAO().getUser(u);
    }
}