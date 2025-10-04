package dat.security.entities;

import java.util.Set;
import dat.security.entities.Role;


public interface ISecurityUser {
    boolean verifyPassword(String pw);
    void addRole(Role role);
}