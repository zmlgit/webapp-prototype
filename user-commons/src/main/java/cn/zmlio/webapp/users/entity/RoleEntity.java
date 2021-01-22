package cn.zmlio.webapp.users.entity;

import cn.zmlio.webapp.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "sys_roles")
public class RoleEntity extends BaseEntity {

    private String name;

    private String code;
}
