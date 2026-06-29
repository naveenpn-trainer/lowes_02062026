package hands_on.user_api.mock_data;

import hands_on.user_api.dto.UserResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MockDataGenerator {
    public static List<UserResponse> getUsersMockData() {
        List<UserResponse> usersList = new ArrayList<>();
        usersList.add(new UserResponse(1L,
                "Naveen",
                " Pn",
                LocalDate.now().minusYears(20),
                "9535584691",
                "naveenpn.trainer@gmail.com",
                "qwerty", LocalDateTime.now(),
                null));

        usersList.add(new UserResponse(2L,
                "Nikshay",
                "  Pn",
                LocalDate.now().minusYears(7),
                "8095",
                "nikshaypn.trainer@gmail.com",
                "qwerty", LocalDateTime.now(),
                null));
        return usersList;
    }
}
