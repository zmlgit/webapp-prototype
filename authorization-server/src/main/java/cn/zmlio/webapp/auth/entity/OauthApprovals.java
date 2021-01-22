package cn.zmlio.webapp.auth.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_approvals")
public class OauthApprovals {
    @Id
    private String userId;
    private String clientId;
    private String scope;
    private String status;
    private java.sql.Timestamp expiresAt;
    private java.sql.Timestamp lastModifiedAt;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public java.sql.Timestamp getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(java.sql.Timestamp expiresAt) {
        this.expiresAt = expiresAt;
    }


    public java.sql.Timestamp getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(java.sql.Timestamp lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

}
