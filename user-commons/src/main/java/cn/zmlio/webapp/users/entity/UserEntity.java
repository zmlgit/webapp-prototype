package cn.zmlio.webapp.users.entity;

import cn.zmlio.webapp.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
@Table(name = "sys_users")
public class UserEntity extends BaseEntity {

    private String username;

    private String password;

    private String email;

    private String telephone;

    @OneToMany(targetEntity = UserRole.class, mappedBy = "user")
    private Set<UserRole> userRoles;

    public Set<RoleEntity> getRoles() {
        return this.getUserRoles().stream().map(userRole -> userRole.getRole()).collect(Collectors.toSet());
    }
}
