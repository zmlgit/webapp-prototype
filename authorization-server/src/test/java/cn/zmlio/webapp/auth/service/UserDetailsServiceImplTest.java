package cn.zmlio.webapp.auth.service;

import cn.zmlio.webapp.users.entity.RoleEntity;
import cn.zmlio.webapp.users.entity.UserEntity;
import cn.zmlio.webapp.users.entity.UserRole;
import cn.zmlio.webapp.users.reposioty.BaseUserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.collections.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserDetailsServiceImplTest {

    @Autowired
    BaseUserRepository baseUserRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Test
    void loadUserByUsername() {
        String username = String.format("user-%d", System.currentTimeMillis());

        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode("123456"));
        user.setEmail(username);
        user.setTelephone(username);

        RoleEntity role = new RoleEntity();
        role.setCode(String.format("role-%d", System.currentTimeMillis()));
        role.setName("test Role");

        UserRole userRole = new UserRole();

        userRole.setUser(user);
        userRole.setRole(role);
        user.setUserRoles(Sets.newSet(userRole));
        baseUserRepository.save(user);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        Assertions.assertNotNull(userDetails);
    }
}