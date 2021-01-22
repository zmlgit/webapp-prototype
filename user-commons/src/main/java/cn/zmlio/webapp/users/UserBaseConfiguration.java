package cn.zmlio.webapp.users;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableJpaRepositories(basePackages = {"cn.zmlio.webapp.users"})
@EntityScan(basePackages = {"cn.zmlio.webapp.users"})
public class UserBaseConfiguration {
    @Bean
    public PasswordEncoder passwordEncoder() {
        // 设置默认的加密方式
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
