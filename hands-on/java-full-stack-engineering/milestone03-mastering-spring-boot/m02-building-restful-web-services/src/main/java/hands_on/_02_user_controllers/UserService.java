package hands_on._02_user_controllers;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private List<UserDTO> userDTOS = getUsers();


    public UserDTO createUser(User user) {
        long id = userDTOS.size() + 1;
        String firstName = user.getFullName().split(" ")[0];
        String lastName = user.getFullName().split(" ")[1];
        UserDTO userDTO = new UserDTO(id, firstName, lastName);
        userDTOS.add(userDTO);
        return userDTO;
    }

    private List<UserDTO> getUsers() {
        List<UserDTO> dummyUsers = new ArrayList<>();
        dummyUsers.add(
                new UserDTO(1L, "Naveen", "Pn"));
        dummyUsers.add(new UserDTO(2L, "Nikshay", "Pn"));
        return dummyUsers;
    }


    public List<UserDTO> findAll() {
        return userDTOS;
    }

}
