package run.Group.web.services;

import run.Group.web.DTO.RegistrationDto;
import run.Group.web.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}
