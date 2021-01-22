package cn.zmlio.webapp.auth.service;

import cn.zmlio.webapp.users.entity.UserEntity;
import cn.zmlio.webapp.users.reposioty.BaseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.stream.Collectors;

@Component("jdbcUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    BaseUserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Optional<UserEntity> optionalUser = userRepository.findByPrinciple(s);

        if (optionalUser.isPresent()) {
            UserEntity user = optionalUser.get();
            return new User(user.getUsername(), user.getPassword(), true, true, true, true,
                    user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getCode())).collect(Collectors.toSet())
            );
        }
        return null;
    }
}
