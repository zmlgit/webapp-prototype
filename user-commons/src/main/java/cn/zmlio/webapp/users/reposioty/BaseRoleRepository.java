package cn.zmlio.webapp.users.reposioty;

import cn.zmlio.webapp.users.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRoleRepository extends JpaRepository<RoleEntity, Long> {
}
