package hands_on._02_user_controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, path = "/api/v1/users")
    public ResponseEntity<UserDTO> createUser(@Valid @RequestBody User user){
        UserDTO newUserCreated = this.userService.createUser(user);
        return new ResponseEntity<>(newUserCreated, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/v1/users")
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> users = userService.findAll();
        return ResponseEntity.ok(users);
    }
}
