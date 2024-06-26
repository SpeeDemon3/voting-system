package com.aruiz.user.notification.repository;

import com.aruiz.user.notification.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * User Repository extends to JpaRepository
 *
 * @author Antonio Ruiz = speedemon
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email) throws Exception;

    Optional<UserEntity> findByDni (String dni) throws Exception;
}
