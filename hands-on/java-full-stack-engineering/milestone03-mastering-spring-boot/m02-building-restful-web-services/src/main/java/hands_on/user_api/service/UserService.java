package hands_on.user_api.service;

import hands_on.user_api.dto.UserRequest;
import hands_on.user_api.dto.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest userRequest);
    UserResponse findById(long id);
    List<UserResponse> findAll();
    UserResponse deleteById(long id);
    UserResponse updateMobile(long id, UserRequest userRequest);
}
