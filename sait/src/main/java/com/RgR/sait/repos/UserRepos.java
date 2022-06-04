package com.RgR.sait.repos;

import com.RgR.sait.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, Long> {
     User findByUsername(String username);
     User findByActivationCode(String code);
}
