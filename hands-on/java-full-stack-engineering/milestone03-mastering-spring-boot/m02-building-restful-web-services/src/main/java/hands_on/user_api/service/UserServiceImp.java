package hands_on.user_api.service;

import hands_on.user_api.dto.UserRequest;
import hands_on.user_api.dto.UserResponse;
import hands_on.user_api.mock_data.MockDataGenerator;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class UserServiceImp implements UserService {

    private List<UserResponse> users = MockDataGenerator.getUsersMockData();

    public List<UserResponse> findAll() {
        return users;
    }

    @Override
    public UserResponse deleteById(long id) {
        return null;
    }

    @Override
    public UserResponse updateMobile(long id, UserRequest userRequest) {
        UserResponse existingUser = findById(id);

        if (existingUser != null) {
            existingUser.setMobile(userRequest.getMobile());
            existingUser.setUpdateTime(LocalDateTime.now());
            return existingUser;
        }

        return null;
    }


    @Override
    public UserResponse createUser(UserRequest request) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId((long) (users.size() + 1));
        userResponse.setFirstName(request.getFullName().split(" ")[0]);
        userResponse.setLastName(request.getFullName().split(" ")[1]);
        userResponse.setDob(request.getDob());
        userResponse.setMobile(request.getMobile());
        userResponse.setEmail(request.getEmail());
        userResponse.setCreateTime(LocalDateTime.now());
        users.add(userResponse);
        return userResponse;
    }

    @Override
    public UserResponse findById(long id) {
        for (UserResponse user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public UserResponse deleteById(Long userId) {
        Iterator<UserResponse> iterator = users.iterator();

        while (iterator.hasNext()) {
            UserResponse user = iterator.next();

            if (user.getId() == userId) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public boolean existsById(Long id) {
        for (UserResponse user : users) {
            if (user.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
