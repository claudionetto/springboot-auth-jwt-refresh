package com.claudionetto.jwtouath2.repositories;

import com.claudionetto.jwtouath2.entities.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {

    Optional<UserInfoEntity> findByEmailId(String emailId);

}
