package hands_on.user_api.controller;

import hands_on.user_api.dto.UserRequest;
import hands_on.user_api.dto.UserResponse;
import hands_on.user_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/users")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
        UserResponse userResponse = this.userService.createUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        List<UserResponse> allUsers = this.userService.findAll();
        return ResponseEntity.ok(allUsers);
    }

    @GetMapping(value = "/users/{userId}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable long userId) {
        UserResponse userResponse = this.userService.findById(userId);
        if(userResponse!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(userResponse);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
