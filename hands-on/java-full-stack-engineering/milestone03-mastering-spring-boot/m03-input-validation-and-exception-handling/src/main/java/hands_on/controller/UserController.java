package hands_on.controller;

import hands_on.dto.UserRequest;
import hands_on.dto.UserResponse;
import hands_on.exception.ErrorDetails;
import hands_on.exception.UserNotFoundException;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import hands_on.service.UserServiceOptionalImp;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserServiceOptionalImp userService;

    @PostMapping(value = "/users")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
        UserResponse userResponse = this.userService.createUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        Optional<List<UserResponse>> allUsers = this.userService.findAll();
        return ResponseEntity.ok().body(allUsers.get());
    }


    @GetMapping(value = "/users/{userId}")
//        public ResponseEntity<UserResponse> getUserById( @PathVariable("userId")  @Min(value = 1, message = "User ID must be positive")Long userId) {
    public ResponseEntity<UserResponse> getUserById(@PathVariable long userId) {

        Optional<UserResponse> userResponse = this.userService.findById(userId);
       /*   if (userResponse.isEmpty()) {
//            return ResponseEntity.notFound().build();
            throw new UserNotFoundException(userId);
        }x
        return ResponseEntity.ok(userResponse.get());
*/
        return userResponse.map(e -> ResponseEntity.ok(userResponse.get())).orElseThrow(() ->
                new UserNotFoundException(userId));
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleUserNotFoundExceptionLocalMethod(
            UserNotFoundException ex,
            WebRequest request) {

        ErrorDetails error = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false)
        );

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
