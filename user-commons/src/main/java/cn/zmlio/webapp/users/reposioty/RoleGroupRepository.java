package cn.zmlio.webapp.users.reposioty;

import cn.zmlio.webapp.users.entity.RoleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleGroupRepository extends JpaRepository<RoleGroup, Long> {

}
