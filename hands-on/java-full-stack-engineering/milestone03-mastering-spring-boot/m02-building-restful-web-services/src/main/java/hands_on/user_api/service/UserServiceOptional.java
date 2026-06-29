package hands_on.user_api.service;

import hands_on.user_api.dto.UserRequest;
import hands_on.user_api.dto.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserServiceOptional {
    UserResponse createUser(UserRequest userRequest);
    Optional<UserResponse> findById(long id);
    Optional<List<UserResponse>> findAll();
    Optional<UserResponse> deleteById(long id);
    Optional<UserResponse> updateMobile(long id, UserRequest userRequest);
}
