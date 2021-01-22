package cn.zmlio.webapp.users.entity;

import cn.zmlio.webapp.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sys_rolegroup")
@Getter
@Setter
public class RoleGroup extends BaseEntity {


    private String name;
    @OneToMany(targetEntity = RoleEntity.class)
    @JoinTable(name = "sys_group_role", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles;

}
