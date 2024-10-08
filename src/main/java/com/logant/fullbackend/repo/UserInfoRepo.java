package com.logant.fullbackend.repo;


import com.logant.fullbackend.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author atquil
 */
@Repository
public interface UserInfoRepo extends JpaRepository<UserInfoEntity,Long> {
    Optional<UserInfoEntity> findByEmailId(String emailId);
}
