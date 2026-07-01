package hands_on.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class UserResponse {

    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String mobile;
    private String email;
    private String password;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

}
