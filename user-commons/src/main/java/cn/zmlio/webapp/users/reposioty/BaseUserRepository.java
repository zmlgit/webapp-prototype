package cn.zmlio.webapp.users.reposioty;

import cn.zmlio.webapp.users.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BaseUserRepository extends JpaRepository<UserEntity, Long> {

    @Query(nativeQuery = true, value = "select * from sys_users where username=?1 or email=?1 or telephone=?1 and yn=1 limit 1")
    Optional<UserEntity> findByPrinciple(String name);
}
