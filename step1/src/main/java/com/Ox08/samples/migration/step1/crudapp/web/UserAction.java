package com.Ox08.samples.migration.step1.crudapp.web;
import com.Ox08.samples.migration.step1.crudapp.model.User;
import com.Ox08.samples.migration.step1.crudapp.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
/**
 * Struts action class has been kept as POJO to simulate real-world migration process.
 * In real projects, there would be tons of such action classes with complicated XML configuration each.
 * So it would be impossible to cover all these with annotations.
 */
public class UserAction extends ActionSupport {
    private List<User> users;
    private User user;
    private UserService userService;
    public String listUsers() {
        users = userService.list();
        return SUCCESS;
    }
    public String newUser() {
        if ((user != null) && (user.getId() != null)) {
            user = userService.load(user.getId());
        }
        return SUCCESS;
    }
    public String saveUser() {
        if (user.getId() == null) {
            userService.add(user);
        } else {
            userService.update(user);
        }
        return SUCCESS;
    }
    public String deleteUser() {
        userService.delete(user.getId());
        return SUCCESS;
    }
    public List<User> getUsers() {
        return users;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    /**
     * Note here on variable name.
     * We use 'struts.objectFactory.spring.autoWire=name', so variable name
     * should match Spring Bean name.
     * @param userService
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
