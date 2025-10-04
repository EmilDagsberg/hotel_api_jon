package dat.security.daos;

import dat.exceptions.EntityNotFoundException;
import dat.exceptions.ValidationException;

import dat.security.entities.Role;
import dat.security.entities.User;
import dk.bugelhartmann.UserDTO;

public interface ISecurityDAO {
    UserDTO getVerifiedUser(String username, String password) throws ValidationException; // used for login

    User createUser(String username, String password); // used for register

    User addRole(UserDTO userDTO, String newRole);
}