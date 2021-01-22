package cn.zmlio.webapp.auth.repository;


import cn.zmlio.webapp.auth.entity.OauthClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OauthClientRepository extends JpaRepository<OauthClientDetails, String> {
}
