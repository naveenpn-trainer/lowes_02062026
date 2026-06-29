package hands_on.user_api.service;

import hands_on.user_api.dto.UserRequest;
import hands_on.user_api.dto.UserResponse;

import java.util.List;
import java.util.Optional;

public class UserServiceOptionalImp  implements UserServiceOptional{
    @Override
    public UserResponse createUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public Optional<UserResponse> findById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<UserResponse>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<UserResponse> deleteById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserResponse> updateMobile(long id, UserRequest userRequest) {
        return Optional.empty();
    }
}
