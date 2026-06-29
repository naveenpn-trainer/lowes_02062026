package hands_on._02_user_controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UserDTO {
    private long userId;
    private String firstName;
    private String lastName;
}
