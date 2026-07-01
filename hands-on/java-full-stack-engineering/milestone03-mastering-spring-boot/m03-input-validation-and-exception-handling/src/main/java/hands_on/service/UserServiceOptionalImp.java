package hands_on.service;


import hands_on.dto.UserRequest;
import hands_on.dto.UserResponse;
import hands_on.mock_data.MockDataGenerator;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Component
public class UserServiceOptionalImp implements UserServiceOptional {

    private List<UserResponse> usersList = MockDataGenerator.getUsersMockData();

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public Optional<UserResponse> findById(long id) {
        return usersList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<List<UserResponse>> findAll() {
        return Optional.of(usersList);
    }



    public UserResponse create(UserRequest request) {
        UserResponse user = new UserResponse();
        user.setId((long) (usersList.size() + 1));
        user.setFirstName(request.getFullName().split(" ")[0]);
        user.setFirstName(request.getFullName().split(" ")[1]);
        user.setDob(request.getDob());
        user.setMobile(request.getMobile());
        user.setEmail(request.getEmail());
        user.setCreateTime(LocalDateTime.now());
        usersList.add(user);
        return user;
    }

    @Override
    public Optional<UserResponse> deleteById(long id) {
        Optional<UserResponse> optionalUser = findById(id);
        optionalUser.ifPresent(this.usersList::remove);
        return optionalUser;
    }


    @Override
    public Optional<UserResponse> updateMobile(long id, UserRequest userRequest) {
        Optional<UserResponse> existingUser = findById(id);
        existingUser.ifPresent(dto -> {
            dto.setMobile(userRequest.getMobile());
            dto.setUpdateTime(LocalDateTime.now());
        });
        return existingUser;
    }
}
