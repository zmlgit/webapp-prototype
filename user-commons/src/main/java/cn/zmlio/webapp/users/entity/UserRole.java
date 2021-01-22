package cn.zmlio.webapp.users.entity;

import cn.zmlio.webapp.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "sys_user_role")
public class UserRole extends BaseEntity {

    @JoinColumn(name = "user_id")
    @ManyToOne(targetEntity = UserEntity.class)
    private UserEntity user;


    @OneToOne(targetEntity = RoleEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private RoleEntity role;
}
