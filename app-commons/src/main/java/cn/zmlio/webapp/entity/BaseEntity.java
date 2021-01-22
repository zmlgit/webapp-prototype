package cn.zmlio.webapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@Cacheable
@Accessors(chain = true)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 64)
    private String updateUser;
    @Column(length = 64)
    private String createUser;
    @Column(updatable = false)
    private Date createTime = new Date();
    private Date updateTime = new Date();
    private boolean yn = true;
    @Version
    private long version;
}
