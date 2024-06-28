package run.Group.web.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import run.Group.web.models.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String userName);
    UserEntity findFirstByUsername(String username);
}