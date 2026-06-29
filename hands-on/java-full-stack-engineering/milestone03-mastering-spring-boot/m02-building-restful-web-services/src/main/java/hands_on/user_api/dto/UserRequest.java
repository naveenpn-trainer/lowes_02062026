package hands_on.user_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
public class UserRequest {
    private String fullName;
    private LocalDate dob;
    private String mobile;
    private String email;
    private String password;

}
