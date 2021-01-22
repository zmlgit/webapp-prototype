package cn.zmlio.webapp.users.entity;

import cn.zmlio.webapp.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sys_usergroup")
@Getter
@Setter
public class UserGroup extends BaseEntity {

    private String name;
    @ManyToMany(targetEntity = UserEntity.class)
    @JoinTable(name = "sys_group_user", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<UserEntity> users;

    @OneToMany(targetEntity = UserGroup.class)
    @JoinColumn(name = "parent_id")
    private List<UserGroup> subGroups;
}
